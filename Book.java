
public class Book {
	private String title;
	private String author;
	/**
	* default constructor
	*/
	public Book () {
		this.title = "Test";
		this.author = null;
	}
	/**
	* constructor with user-input title/author
	*/
	public Book (String title, String author) {
		this.title = title;
		this.author = author;
	}
	/**
	* setter for Author
	*/
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	* setter for Title
	*/
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	* getter for Author
	*/
	public String getAuthor() {
		return this.author;
	}
	/**
	* getter for Title
	*/
	public String getTitle() {
		return this.title;
	}
	/**
	* prints title and author
	*/
	public String toString() {
		return "\"" + this.title + "\" by " + this.author;
	}
}
