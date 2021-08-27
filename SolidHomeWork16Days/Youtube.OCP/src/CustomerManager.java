

public class CustomerManager implements CustomerService {
	
	CustomerDalService customerDalService;
	
	public CustomerManager(CustomerDalService customerDalService) {
		super();
		this.customerDalService = customerDalService;
	}

	@Override
	public void Add() {
		
			customerDalService.Add();
		
		
	}

	

}
