package app.delivery;

public class Driver implements SubscriberBase {
	
	private String name;
	private Shop shop;
	public DeliveryRequest delivery;
	
	public Driver(String name, Shop shop, DeliveryRequest delivery) {
		this.name = name;
		this.shop = shop;
		this.delivery = delivery;
		this.shop.subscribe(this);
	}
	

	@Override
	public void updateSelf(DeliveryRequest delivery) {
		this.delivery = delivery;
		
		System.out.println("Driver: " + this.getName() + " has received the message and is ready to deliver: " + getMyLatestUpdate());
		
	}


	public String getMyLatestUpdate() {
		return this.delivery.product;
	}


	public String getName() {
		return this.name;
	}

}
