package singletonpattern;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonSerializationResolved implements Serializable {
	public static SingletonSerializationResolved instance = null;

	private SingletonSerializationResolved() {}

	public static SingletonSerializationResolved getInstance() {
		if(instance==null){
			instance=new SingletonSerializationResolved();
		}
		return instance;
	}
	//implement the readresolve ()
	private Object readResolve() throws ObjectStreamException{
		System.out.println("read resolve");
		return instance;
	}

}

class TestClassDemo {
	public static void main(String[] args) throws Exception {
		SingletonSerializationResolved s1 = SingletonSerializationResolved.getInstance();
		SingletonSerializationResolved s2 = SingletonSerializationResolved.getInstance();
		print(s1);
		print(s2);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"C:/Users/Jitendra/workspace-designpatterns/DesignPatterns/src/singletonpattern/abc.txt"));
		oos.writeObject(s2);
		oos.close();
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:/Users/Jitendra/workspace-designpatterns/DesignPatterns/src/singletonpattern/abc.txt"));
		SingletonSerializationResolved object = (SingletonSerializationResolved)ois.readObject();
		print(object);
	}

	 static void print(SingletonSerializationResolved s) {
		System.out.println("object: " + s.hashCode());
	}
}