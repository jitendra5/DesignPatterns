package prototypepattern;

public class PrototypeDemo {


	public static void main(String[] args) throws CloneNotSupportedException {
		BookStrore bs= new BookStrore();
		bs.setStoreName("visakha");
		bs.loadBooks();
		
		//prototype pattern implementation.
		/**
		 * WHile creating a sceond object bs1, if we again
		 * try to call the loadBOoks() method, then it makes the database calls and 
		 * some time gets wasted. the idea is to grab the data from the object 'bs'. This is done
		 * by using cloning.
		 * shallowcloning is what is shown here. Where we override the default clone() of
		 * clonable interface. But there is aproblem with this one. if we change the object 'bs'
		 * the same is refected back to its clone object. i.e. if we remove a book form 'bs' then,
		 * the 'bs1' also doesnt contain that book.
		 * So, we do deep cloning. where we create 2 objects...
		 * the 1st object is created by making calls to database. the second object is created
		 * by coping the data from 1st object into the 2nd.
		 * 
		 */
		BookStrore bs1= (BookStrore) bs.clone();
		bs.getBooks().remove(2);
		bs1.setStoreName("Akshara");
		System.out.println(bs);
		System.out.println(bs1);
	}

}
