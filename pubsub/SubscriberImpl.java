package pubsub;

public class SubscriberImpl extends Subscriber{

	@Override
	public void addSubscriber(String topic, PubsubService service) {
		service.addSubscriber(topic,this);
	}

	@Override
	public void unSubscribe(String topic, PubsubService service) {
		service.removeSubscriber(topic,this);
	}

	@Override
	public void getMessagesForSubscriberOfTopic(String topic, PubsubService service) {
		service.getMessagesForSubscriberOfTopic(topic,this);
	}

}
