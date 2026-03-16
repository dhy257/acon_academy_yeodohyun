package 실습;

public class Book1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book1 book1 = new Book1("자바 프로그래밍1", "홍길동1", 10000);
		Book1 book2 = new Book1("자바 프로그래밍2", "홍길동2", 20000);
		Book1 book3 = new Book1("자바 프로그래밍3", "홍길동3", 30000);

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());

	}

}
