package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> list = new ArrayList<Item>();

	public void addItem(Item item) {
		list.add(item);
	}

	public void getItems() {
		for (Item i : list) {
			System.out.println("Item name: " + i.name());
			System.out.println("Item name: " + i.cost());
			System.out.println("Item name: " + i.packing().pack());
		}
	}

	public void getCost() {
		int cost = 0;
		for (Item i : list) {
			cost = cost + i.cost();
		}
		System.out.println("Total Cost" + cost);
	}
}
