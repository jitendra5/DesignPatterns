package singletonpattern;

import java.lang.reflect.Constructor;

public class SingletonReflectionResolved {
public static SingletonReflectionResolved instance=null;
private SingletonReflectionResolved(){
	if(instance!=null){
		throw new RuntimeException("Cannot create the instance.");
	}
	System.out.println("instance creating");
		
}
public static SingletonReflectionResolved getInstance(){
	if(instance==null){
		instance=new SingletonReflectionResolved();
	}
	return instance;
}

}
class SingletonReflectionResolve{
	public static void main(String[] args) throws Exception {
		SingletonReflectionResolved instance1 = SingletonReflectionResolved.getInstance();
		SingletonReflectionResolved instance2 = SingletonReflectionResolved.getInstance();
		print(instance1);
		print(instance2);
		//correct reflection
		Class cls= Class.forName("singletonpattern.SingletonReflectionResolved");
		Constructor<SingletonReflectionResolved>  declaredConstructor = cls.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		SingletonReflectionResolved newInstance = declaredConstructor.newInstance();
		print(newInstance);
	}
	public static void print(Object obj){
		System.out.println("object"+obj.hashCode());
		
	}
}