package Concrete;



import Abstract.DiscountService;
import Entity.Discount;

public class DiscountManager implements DiscountService {

	@Override
	public void add(Discount discount) {
		System.out.println(discount.getInfo() + "sisteme % " + discount.getDiscountPercent() + "indirin oranıyla eklenmistir.");
		
	}

	@Override
	public void delete(Discount discount) {
		
		System.out.println(discount.getInfo() + "sistemden kaldırılmıştır.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getInfo() + "güncellenmistir.");
		
	}

}
