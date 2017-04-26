package pubsub;

public interface Publisher {
public void publish(Message message, PubsubService service);
}
