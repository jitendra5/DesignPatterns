package observerpattern;

public class WeatherInfoWebsite implements Observer {

	@Override
	public void update(int temp) {
		System.out.println("The ttemperature from the website is: "+ temp +"degrees" );
	}

}
