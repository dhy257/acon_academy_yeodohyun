package 실습;

public class Book4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book4 book = new Book4("자바", "홍길동", 30000);

		// private => 직접 접근 불가
		// System.out.println(book.title);

		// public 메서드로 접근
		System.out.println("제목: " + book.getTitle());

		// public → 직접 접근 가능
		System.out.println("저자: " + book.author);

		// default → 같은 패키지라면 접근 가능
		System.out.println("가격: " + book.price);
	}

}
