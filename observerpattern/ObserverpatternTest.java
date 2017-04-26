package observerpattern;

public class ObserverpatternTest {
	public static void main(String[] args) throws InterruptedException {
		WeatherBroadcast wb= new WeatherBroadcast();
		NewsPaperAgency news= new NewsPaperAgency();
		NewsChannel ch= new NewsChannel();
		WeatherInfoWebsite web= new WeatherInfoWebsite();
		wb.addObserver(news);
		wb.addObserver(web);
		wb.addObserver(ch);
		wb.temperatureChanged(33);
		System.out.println("After two minutes te temperature changes.");
		Thread.sleep(12000);
		wb.temperatureChanged(35);
	}
	

}
