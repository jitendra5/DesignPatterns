package observerpattern;

public class NewsPaperAgency implements Observer {

	@Override
	public void update(int temp) {
		System.out.println("The ttemperature from the news paper agency is: "+ temp +"degrees" );
	}

}
