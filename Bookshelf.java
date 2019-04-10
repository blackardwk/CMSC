import java.util.ArrayList;

public class Bookshelf {
	private int size;
	private ArrayList<Book> books;
	/**
	* bookshelf size given user doesn't input amount
	*/
	public Bookshelf() {
		this.size = 2;
		this.books = new ArrayList<Book>();
	}
	/**
	* bookshelf size with user input
	*/
	public Bookshelf(int size) {
		this.size = size;
		this.books = new ArrayList<Book>();
	}
	/**
	* getter for size
	*/
	public int getSize() {
		return this.size;
	}
	/**
	* getter for books
	*/
	public ArrayList<Book> getBooks() {
		return this.books;
	}
	/**
	* adds a book to bookshelf
	*/
	public void addBook(Book newBook) {
		if (this.books.size() < this.size) {
			this.books.add(newBook);
		}
	}
	/**
	 * removes first book
	 */
	public void removeBook() {
		this.books.remove(0);
	}
	/**
	 * empties the bookshelf
	 */
	public void emptyBookshelf() {
			this.books.clear();
	}
}
