package main;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> listofbooks = new ArrayList<Book>();

	public Library() {
	}

	public void addBook(Book newBook) {
		this.listofbooks.add(newBook);
	}

	public void printBooks() {
		for (Book book : this.listofbooks) {
			System.out.println(book);
		}
	}
	
		
	public ArrayList<Book> searchByTitle(String title){
		ArrayList<Book> results= new ArrayList<Book>();
		for(Book book: this.listofbooks) {
			if (StringUtils.included(book.title(), title)){
				results.add(book);
			}
		}
		return results;
		}
		
	
		public ArrayList<Book> searchByPublisher(String publisher){
		ArrayList<Book> results= new ArrayList<Book>();
		for(Book book: this.listofbooks) {
			if (StringUtils.included(book.publisher(), publisher)){
				results.add(book);
			}
		}
		return results;
	}
	
	public ArrayList<Book> searchByYear(int year){
		ArrayList<Book> results= new ArrayList<Book>();
		for(Book book: this.listofbooks) {
			if (book.year()==year){
				results.add(book);
			}
		}
		return results;
	} 
	
	
	
	

}
