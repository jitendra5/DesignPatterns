package pubsub;

import java.util.ArrayList;
import java.util.List;

public abstract class Subscriber {
private List<Message> subscriberMessages= new ArrayList<>();
public List<Message> getSubscriberMessages() {
	return subscriberMessages;
}
public void setSubscriberMessages(List<Message> subscribedMessages) {
	this.subscriberMessages = subscribedMessages;
}
public abstract void addSubscriber(String topic, PubsubService service);
public abstract void unSubscribe(String topic, PubsubService service);
public abstract void getMessagesForSubscriberOfTopic(String topic, PubsubService service);
public void printAllMessages(){
	for(Message i:subscriberMessages){
		System.out.println("Message Topic id: "+i.getTopic()+"Message:"+i.getPayLoad());
	}
}
}
