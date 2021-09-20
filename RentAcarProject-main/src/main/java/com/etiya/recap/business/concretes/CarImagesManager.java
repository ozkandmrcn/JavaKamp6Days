package com.etiya.recap.business.concretes;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.recap.business.abstracts.CarImagesService;
import com.etiya.recap.business.constants.Messages;
import com.etiya.recap.core.utilities.business.BusinessRules;
import com.etiya.recap.core.utilities.results.DataResult;
import com.etiya.recap.core.utilities.results.ErrorResult;
import com.etiya.recap.core.utilities.results.Result;
import com.etiya.recap.core.utilities.results.SuccessDataResult;
import com.etiya.recap.core.utilities.results.SuccessResult;
import com.etiya.recap.dataAccess.abstracts.CarImagesDao;
import com.etiya.recap.entities.concretes.Car;
import com.etiya.recap.entities.concretes.CarImages;
import com.etiya.recap.entities.requests.CreateCarImagesRequest;

@Service
public class CarImagesManager implements CarImagesService {

	private CarImagesDao carImagesDao;

	@Autowired
	public CarImagesManager(CarImagesDao carImagesDao) {
		this.carImagesDao = carImagesDao;
	}

	@Override
	public DataResult<List<CarImages>> getAll() {
		return new SuccessDataResult<List<CarImages>>(this.carImagesDao.findAll(), Messages.GetAll);
	}

	@Override
	public Result add(CreateCarImagesRequest createCarImagesRequest) {
        var result=BusinessRules.run(checkIfCarHasMoreThanFiveImages(createCarImagesRequest.getCarId(),5));
		if(result!=null)
		{
			return result;
		}
		
		CarImages carImages = new CarImages();
		String imageNameRandom=UUID.randomUUID().toString();
		//Default Resim atama işlemi --- Bunu rules içinde mi yapmalıydık öğren
		if(createCarImagesRequest.getImagePath().isEmpty()) {
			carImages.setImagePath(imageNameRandom+".jpg");
		}else {
			carImages.setImagePath(createCarImagesRequest.getImagePath());
		}
		
		Car car=new Car();
		car.setId(createCarImagesRequest.getCarId());

		carImages.setDate(createCarImagesRequest.getDate());
		carImages.setCar(car);

		this.carImagesDao.save(carImages);
		return new SuccessResult(true, Messages.Add);
	}

	@Override
	public DataResult<CarImages> getById(int id) {
		return new SuccessDataResult<CarImages>(this.carImagesDao.getById(id), Messages.GetById);
	}

	@Override
	public Result delete(CreateCarImagesRequest createCarImagesRequest) {

		CarImages carImages = new CarImages();
		carImages.setId(createCarImagesRequest.getId());

		this.carImagesDao.delete(carImages);
		return new SuccessResult(true, Messages.Delete);
	}

	@Override
	public Result update(CreateCarImagesRequest createCarImagesRequest) {

		CarImages carImages = new CarImages();
		carImages.setId(createCarImagesRequest.getId());
		carImages.setImagePath(createCarImagesRequest.getImagePath());
		carImages.setDate(createCarImagesRequest.getDate());

		this.carImagesDao.save(carImages);
		return new SuccessResult(true, Messages.Update);
	}
	
	private Result checkIfCarHasMoreThanFiveImages(int carId,int limit)
	{
		  if(this.carImagesDao.countByCar_id(carId)>=limit)
		  {
			  return new ErrorResult(Messages.ErrorIfCarHasMoreImages);
		  }
		  return new SuccessResult();
	}
}
