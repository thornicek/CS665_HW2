package app.delivery;

public class Main {

	public static void main(String[] args) {
		
		
		Shop wallmart = new Shop("Wallmart");
		
		Driver Joe = new Driver("Joe", wallmart);
		Driver John = new Driver("John", wallmart);
		Driver Mike = new Driver("Mike", wallmart);
		
		wallmart.setDeliveryRequest("Apple");
		
	}

}
