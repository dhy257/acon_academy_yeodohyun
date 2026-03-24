package 실기시험여도현;

public class Book {
	String bookCode;
	String bookTitle;
	String author;

	public Book(String bookCode, String bookTitle, String author) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}

	@Override
	public String toString() {
		return bookCode + ", " + bookTitle + ", " + author;
	}

}
