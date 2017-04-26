package singletonpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonThread {
public static volatile SingletonThread instance=null; // a change to a volatile varible will be 
//published only when the change is complete.
private SingletonThread(){}
 //make method synchronized.
/*
public static synchronized SingletonThread getInstance(){
	if(instance==null){							
		instance=new SingletonThread();
	}
	System.out.println("Creating instance.");
	return instance;
}*/
//double check locking.//most proposed oone for multithread access to singleton.
/*
public static SingletonThread getInstance(){
	if(instance==null){  
		synchronized(SingletonThread.class){
			if(instance==null){
				instance=new SingletonThread();
			}
		}
			}
	return instance;
}
*/

//Singleton Holder class
public static SingletonThread getInstance(){
	return Holder.INSTANCE;
}
static class Holder{
	static final SingletonThread INSTANCE= new SingletonThread();
}



}

class Test{
	private static void create() {
		SingletonThread thread= SingletonThread.getInstance();
		print(thread);
	}
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(3);
		service.submit(Test::create);
		service.submit(Test::create);
		service.submit(Test::create);
		service.shutdown();
		
	}
	private static void print(SingletonThread thread) {
		System.out.println("object: "+thread.hashCode());
	}
}