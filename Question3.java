package lab6;


import java.util.*;
public class Question3 {
	public static void main(String []args) {
		ArrayList<Book> books=new ArrayList<>();
		books.add(new Book(1,"java",5,500));
		books.add(new Book(2,"c",4,400));
		books.add(new Book(3,"Python",7,250));
		
		System.out.println("All the books-----------");
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		System.out.println("Sorted the books");
		Collections.sort(books);
		
		for(Book temp:books) {
			System.out.println(temp);
		}
		//sorted by comparator
		
		System.out.println("Sorted the books by title");
		Collections.sort(books,new BookSortbyTitle());
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		System.out.println("Sorted the books by price then by pages");
		Collections.sort(books,new BookSortbyPricethenbyPages());
		for(Book temp:books) {
			System.out.println(temp);
		}
		
		
	}


}