package prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class BookStrore implements Cloneable{
	/* shallow cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/
	//deep cloning
	//here we are coping the data from the first object.
	@Override
	protected BookStrore clone() throws CloneNotSupportedException {
		BookStrore bs= new BookStrore(); 
		for(Book b: this.getBooks()){
			bs.getBooks().add(b);
		}
		return bs;
	} 
	List<Book> books = new ArrayList<Book>();
	private String storeName;
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public  void loadBooks(){
		for(int i=0;i<10;i++){
			Book book= new Book();
			book.setId(i);
			book.setName("book"+i);
			books.add(book);
		}
	}
	@Override
	public String toString() {
		return "BookStrore [storeName= " + storeName + ", books=" + books + ", ]";
	}
	

}
