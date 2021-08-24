package static12DaysDemo;

public class ProductValidator {
	
	static
	{
		
		
		System.out.println("static yapıcı blok çalıştı");
		
	}
	
	public static boolean isValid(Product product) {
		
		if(product.Price>0 && !product.name.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public void bisey()
	{
		
	}
	
	public static class BaskaBirClass //innerclass
	{
		public static void sil()
		{
			
		}
	}

}
