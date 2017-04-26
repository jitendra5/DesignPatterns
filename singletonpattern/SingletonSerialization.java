package singletonpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerialization implements Serializable{
	public static SingletonSerialization instance=new SingletonSerialization();
	private SingletonSerialization(){}
	public static SingletonSerialization getInstance(){
		return instance;
	}

}
 class TestClass{
	 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		 SingletonSerialization s1 = SingletonSerialization.getInstance();
		 SingletonSerialization s2 = SingletonSerialization.getInstance();
		 print(s1); print(s2);
		//serialization violates the singleton pattern.
		 ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:/Users/Jitendra/workspace-designpatterns/DesignPatterns/src/singletonpattern/abc.txt"));
		oos.writeObject(s2);
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:/Users/Jitendra/workspace-designpatterns/DesignPatterns/src/singletonpattern/abc.txt"));
		SingletonSerialization s= (SingletonSerialization)ois.readObject();
		print(s);
	 }

	private static void print(SingletonSerialization s) {
		// TODO Auto-generated method stub
		System.out.println("object"+s.hashCode());
	}
 }