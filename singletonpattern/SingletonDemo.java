package singletonpattern;

public class SingletonDemo {

	public static void main(String[] args) {
		SingletonP instance = SingletonP.getInstance();
		instance.showmessage();
	}

}
