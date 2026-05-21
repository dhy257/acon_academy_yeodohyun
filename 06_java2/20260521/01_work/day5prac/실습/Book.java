package day5prac.실습;

public class Book {

	private String title;
	private String author;
	private BookGenre genre;

	public Book(String title, String author, BookGenre genre) {

		this.title = title;
		this.author = author;
		this.genre = genre;

	}

	public void printInfo() {

		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("장르 : " + genre);

	}
}