package 실습2;

public class Book {

	String title;
	String author;
	int price;

	public void inputBook(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void printBook() {
		System.out.println("책 제목: " + this.title);
		System.out.println("저자: " + this.author);
		System.out.println("가격: " + this.price);
	}
}
