package hashhMap;

public class Main {

	public static void main(String[] args) {
		
           MyHashMap cities = new MyHashMap();

		

		cities.put("34","İstanbul");
		cities.put("57","Sinop");
		cities.put("06","Ankara");

		

		

		for (String item : cities.getAllCities()) {

			System.out.println(item);

		}

		


	}

}
