package observerpattern;

public class NewsChannel implements Observer {

	@Override
	public void update(int temp) {
		System.out.println("The ttemperature from the news channel is: "+ temp +"degrees" );
	}

}
