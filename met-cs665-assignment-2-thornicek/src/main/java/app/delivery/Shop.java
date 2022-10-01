package app.delivery;

import java.util.ArrayList;

public class Shop implements PublisherBase {
	
	private String name;
	private String deliveryUpdate;
	
	
	private ArrayList<SubscriberBase> deliveryDriverList = new ArrayList<SubscriberBase>();
	
	public Shop(String name) {
		this.name = name;
		this.setDeliveryRequest("Product X");
	}
	
	String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// Method to notify the subscribers that product is ready for delivery
	public void setDeliveryRequest(String deliveryUpdate) {
		this.deliveryUpdate = deliveryUpdate;
		this.notifySubscribers();	
	}
	
	// Add subscriber
	@Override
	public void subscribe(SubscriberBase o) {
		deliveryDriverList.add(o);
		
	}
	
	// Remove subscriber
	@Override
	public void unsubscribe(SubscriberBase o) {
		deliveryDriverList.remove(o);
		
	}
	
	// Call the update method on subscribers, when there is change
	@Override
	public void notifySubscribers() {
		for(SubscriberBase o : deliveryDriverList) {
			o.updateSelf(this.deliveryUpdate);
		}
		
	}

}
