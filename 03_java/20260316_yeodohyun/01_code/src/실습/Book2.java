package 실습;

public class Book2 {

	String title;
	String author;
	int price;

	public Book2() {

	}

	public Book2(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// toString 메서드
	public String toString() {
		return "제목: " + title + ", 저자: " + author + ", 가격: " + price;
	}
}