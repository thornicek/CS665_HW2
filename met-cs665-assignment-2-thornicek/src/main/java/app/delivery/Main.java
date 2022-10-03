package app.delivery;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<SubscriberBase> deliveryDriverList = new ArrayList<SubscriberBase>();
		
		Shop wallmart = new Shop("Wallmart");
		
		DeliveryRequest newDelivery = new DeliveryRequest("banana", wallmart, deliveryDriverList);
		
		
		Driver Joe = new Driver("Joe", wallmart, newDelivery);
		Driver John = new Driver("John", wallmart, newDelivery);
		Driver Mike = new Driver("Mike", wallmart, newDelivery);
		
		deliveryDriverList.add(Joe);
		deliveryDriverList.add(Mike);
		deliveryDriverList.add(John);
		
		wallmart.setDeliveryRequest(newDelivery);
		
	}

}
