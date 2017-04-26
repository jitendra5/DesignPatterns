package pubsub;

public class PublisherImpl implements Publisher {

	@Override
	public void publish(Message message, PubsubService service) {
		service.addMessageToQueue(message);
	}

}
