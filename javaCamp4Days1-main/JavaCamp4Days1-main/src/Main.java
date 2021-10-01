
public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(new Customer(1,"özkan","Demircan",	"578258645190" ,1996,16));
		
	
		
		System.out.println(customerManager);
		
		
	

	}
	
	

}
