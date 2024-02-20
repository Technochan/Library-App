package LibraryApp;

import java.util.*;

public class LibraryMainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Library store = new Library();
		System.out.println("Welcome to the Library");
		boolean entry = false;
		
		while(!entry) {
			
			System.out.println("Choose The One");
			System.out.println("**************");
			
			System.out.println("1. Add New Book");
			System.out.println("2. Retrieve Book");
			System.out.println("3. Show All Available Books");
			System.out.println("4. Exit");
			
			int choice = scan.nextInt();
			
			switch(choice)
			{
			
				case 1 : Scanner scans = new Scanner(System.in);
						 System.out.println("Enter the Book Title : ");
					     String title = scans.nextLine();
					     
					     System.out.println("Enter the Autor Name : ");
					     String author = scans.nextLine();
					     
					     Book newBook = new Book(title,author);
					     store.addBook(newBook);
					     break;
					     
				case 2 : System.out.println("1.Retrieve Book by ID");
						 System.out.println("2.Retrieve Book by Title");
						 System.out.println("3.Retrieve Book by Author");
						 int input = scan.nextInt();
						 
						 switch(input)
						 {
						 	case 1 : System.out.println("Enter the ID: ");
						 			 int inputId = scan.nextInt();
						 			 store.retrieveId(inputId);
						 			 break;
						 	case 2 : System.out.println("Enter the Title: ");
						 		     String inputTitle = scan.next();
						 		     store.retrieveTitle(inputTitle);
						 			 break;	
						 	case 3 : System.out.println("Enter the Author: ");
						 			 String inputAuthor = scan.next();
						 			 store.retrieveAuthor(inputAuthor);
						 			 break;	
						 	default : System.out.println("Invalid choice");
						 	
						 }
						 break;
				case 3 : store.retrieveAllBooks();
						 break;
				case 4 : System.out.println("Thanks...!  Come Again");
						 entry = true;
						 break;
				default : System.out.println("Invalid Choice...! Try again");
			}
		}
	}
}
