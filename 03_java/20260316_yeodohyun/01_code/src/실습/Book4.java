package 실습;

public class Book4 {
	private String title; // private : 같은 클래스에서만 접근 가능
	public String author; // public : 어디서든 접근 가능
	int price; // default : 같은 패키지에서만 접근 가능

	public Book4() {

	}

	public Book4(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// private 변수 접근을 위한 public 메서드
	public String getTitle() {
		return title;
	}
}
