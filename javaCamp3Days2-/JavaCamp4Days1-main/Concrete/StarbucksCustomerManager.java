
public class StarbucksCustomerManager extends  BaseCustomerManager {
	
	
	 CustomerCheckService _customerCheckService;
	 
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService)
	 {
		 this._customerCheckService=customerCheckService;
	 }
		
	
	
	@Override
	
	public void save (Customer customer)
	{
	    if(_customerCheckService.CheckIfRealPerson(customer))
	    {
	    	this.save(customer);
	    }
	    else 
	    {
	    	
	    	  throw new RuntimeException("Not a valid person");
	    	
	    }
	}
}
	
	
	

	


