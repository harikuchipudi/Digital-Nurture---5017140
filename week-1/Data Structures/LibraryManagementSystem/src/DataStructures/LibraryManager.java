package DataStructures;
import java.util.*;

public class LibraryManager {
	private Book[] books;
	private int count;
	
	public LibraryManager(int size) {
		books = new Book[size];
		this.count = 0;
	}
	
	public void addBook(Book book) {
		if(count<books.length) {
			books[count++] = book;
		}
		else {
			System.out.println("Library is full");
		}
	}
	
	//linear search
	public Book linearSearchByTitle(String title) {
	        for (int i = 0; i < count; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                return books[i];
	            }
	        }
	        return null;
	    }
	
	//binary search
	public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, count); // Ensure the array is sorted
        int left = 0;
        int right = count - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
	
	public void traverseBooks() {
        if (count == 0) {
            System.out.println("No books to display.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
	
	public static void main(String[] args) {
		LibraryManager manager = new LibraryManager(5);

        Book book1 = new Book("B001", "Java Programming", "John Doe");
        Book book2 = new Book("B002", "Python Programming", "Jane Smith");
        Book book3 = new Book("B003", "Algorithms", "Robert Martin");

        manager.addBook(book1);
        manager.addBook(book2);
        manager.addBook(book3);

        System.out.println("Books after adding:");
        manager.traverseBooks();

        System.out.println("\nLinear Search for 'Python Programming':");
        Book foundBookLinear = manager.linearSearchByTitle("Python Programming");
        System.out.println(foundBookLinear != null ? foundBookLinear : "Book not found");

        System.out.println("\nBinary Search for 'Python Programming':");
        Book foundBookBinary = manager.binarySearchByTitle("Python Programming");
        System.out.println(foundBookBinary != null ? foundBookBinary : "Book not found");
	}
}
