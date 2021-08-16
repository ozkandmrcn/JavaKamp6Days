package hashhMap;

public class MyHashMap {
	
	private String[] plaque = new String[0];

	private String[] city = new String[0];

	
	public void put(String key, String value) {

		String[] tempKey = new String[(this.plaque.length)+1];

		String[] tempValue = new String[(this.city.length)+1];

		for(int i=0 ; i<this.plaque.length ; i++) {

			tempKey[i] = this.plaque[i];

			tempValue[i] = this.city[i];

		}

		tempKey[this.plaque.length] = key;

		tempValue[this.city.length] = value;

		

		this.plaque = tempKey;

		this.city = tempValue;

	}

	


	public String[] getAllCities() {

		String[] array = new String[this.plaque.length];

		for (int i = 0; i < this.plaque.length; i++) {



			array[i] = this.plaque[i] + "----------- "+ this.city[i];

		}

		return array;

}}
