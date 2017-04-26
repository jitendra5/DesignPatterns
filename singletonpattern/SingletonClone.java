package singletonpattern;

public class SingletonClone implements Cloneable{
	public static SingletonClone instance=null;
	private SingletonClone() throws CloneNotSupportedException{
		if(instance!=null){
			throw new CloneNotSupportedException();
		}
			System.out.println("Creating instance.");
	}
	public static SingletonClone getInstance() throws CloneNotSupportedException{
		if(instance==null){
			instance= new SingletonClone();
		}
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();// if we delete this line, we can create a new insatnce.
		//return super.clone();
	}

}
class TestCloneClass{
	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonClone s1 = SingletonClone.getInstance();
		SingletonClone s2 = SingletonClone.getInstance();
		print(s1); print(s2);
		SingletonClone s3= 	(SingletonClone)s2.clone();
		print(s3);
	}
	private static void print(SingletonClone s) {
		System.out.println("object: "+s.hashCode());
	}
}
