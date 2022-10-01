package app.delivery;

public class Driver implements SubscriberBase {
	
	private String name;
	private Shop shop;
	private String deliveryUpdate;
	
	public Driver(String name, Shop shop) {
		this.name = name;
		this.shop = shop;
		this.deliveryUpdate = "";
		this.shop.subscribe(this);
	}
	

	@Override
	public void updateSelf(String latestUpdate) {
		this.deliveryUpdate = latestUpdate;
		
		System.out.println("Driver: " + this.getName() + " has received the message and is ready to deliver: " + getMyLatestUpdate());
		
	}


	public String getMyLatestUpdate() {
		return this.deliveryUpdate;
	}


	public String getName() {
		return this.name;
	}

}
