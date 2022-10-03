package app.delivery;

import java.util.ArrayList;

public interface MessageBase {
	
	PublisherBase sender = null;
	
	ArrayList<SubscriberBase> receiver = new ArrayList<SubscriberBase>();

}
