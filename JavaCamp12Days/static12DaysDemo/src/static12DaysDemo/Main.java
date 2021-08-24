package static12DaysDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager=new ProductManager();
		Product product=new Product();
		product.id=1;
		product.name="mouse";
		product.Price=10;
		
		
		
		manager.add(product);
		
		
		DatabaseHelper.Connection.createConnection(); //inner class kullanımı 

	}

}
