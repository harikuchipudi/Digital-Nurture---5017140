package DataStructures;

public class Book implements Comparable<Book> {
	
	private String bookId;
	private String title;
	private String author;
	
	public Book(String bookId, String title, String author) {
		this.bookId = bookId;
		this.author = author;
		this.title = title;
	}
	
	public String getBookId() {
		return this.bookId;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	@Override
	public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

}
