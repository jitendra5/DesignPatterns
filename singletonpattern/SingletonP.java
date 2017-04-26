package singletonpattern;

public class SingletonP {
	public static SingletonP singleton= new SingletonP();
	private SingletonP(){}
	public static SingletonP getInstance(){
		return singleton;
	}
	public  void showmessage(){
		System.out.println("Hello world");
	}
	public static void print(Object obj){
		System.out.println("obj: "+obj.hashCode());
	}
}
