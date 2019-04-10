
public class Lab12 {

	public static void main(String[] args) {
		Book One = new Book("Harry Potter", "JK Rowling");
		Book Two = new Book("Of Fire And Ice", "Kip Blackard");
		Book Three = new Book("A Dog's Life", "Christian Kim");
		System.out.println(One.toString());
		System.out.println(Two.toString());
		System.out.println(Three.toString());
		
		/**
		* adds books to bookshelf
		*/
		Bookshelf study = new Bookshelf(3);
		study.addBook(One);
		study.addBook(Two);
		study.addBook(Three);
		
		/**
		* prints current books on bookshelf
		*/
		for (Book Current : study.getBooks()) {
			System.out.println(Current.toString());
		}
		/**
		* empties bookshelf
		*/
		study.emptyBookshelf();
		for (Book Current : study.getBooks()) {
			System.out.println(Current.toString());
		}
	}
	
}
