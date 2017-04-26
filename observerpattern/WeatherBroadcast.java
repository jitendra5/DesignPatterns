package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherBroadcast implements Subject{
	private List<Observer> list= new ArrayList<>();
	private int temperature;
	@Override
	public void addObserver(Observer obs) {
		list.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		list.remove(obs);
	}

	@Override
	public void notifyObserver() {
		for(Observer i: list){
			i.update(temperature);
		}
	}
	public void temperatureChanged(int temp){
		temperature=temp;
		notifyObserver();
	}

}
