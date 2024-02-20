package LibraryApp;

public class Book {
	public static int nextId = 1;
	
	private int Id;
	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.Id = nextId++;
		this.title = title;
		this.author = author;
	}
	
	public  int getId() {
		return Id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return "ID : "+ Id + " | Title : "+title+" | Author : "+author;
	}
}
