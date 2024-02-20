package LibraryApp;

import java.util.*;

public class Library {
	List<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added Successfully "+" (ID) "+ book.getId());
	}
	
	public void retrieveId(int id) {
		for(Book book : books) {
			if(book.getId() == id) {
				System.out.println("Book is Found");
				System.out.println(book);
				return;
			}
		}
		System.out.println("Book is Not Found Or Invalid Id");
	}
	
	public void retrieveTitle(String title) {
		boolean found = false;
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Book is Found");
				System.out.println(book);
				found = true;
			}
		}
		if(!found)
		System.out.println("Book is Not Found Or Invalid Title");
	}
	
	public void retrieveAuthor(String author) {
		boolean found = false;
		for(Book book : books) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println("Book is Found");
				System.out.println(book);
				found = true;
			}
		}
		if(!found)
		System.out.println("Book is Not Found Or Invalid Author");
	}
	
	public void retrieveAllBooks() {
		for(Book book : books) {
			System.out.println(book);
		}
	}
}
