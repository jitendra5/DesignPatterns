package singletonpattern;

import java.lang.reflect.Constructor;

public class SingletonReflection {
	public static void main(String[] args) throws Exception {
		SingletonP instance1 = SingletonP.getInstance();
		SingletonP instance2 = SingletonP.getInstance();
		System.out.println("instance1: "+instance1.hashCode());
		System.out.println("instance2: "+instance2.hashCode());
		//reflection this can violate the singleton pattern.
		Class cls= Class.forName("singletonpattern.SingletonP");
		Constructor<SingletonP> constructor= cls.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonP s3=constructor.newInstance();
		SingletonP.print(s3);
			
	}
	
}
