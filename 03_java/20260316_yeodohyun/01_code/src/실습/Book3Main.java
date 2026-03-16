package 실습;

public class Book3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 배열 생성
		Book3[] books = new Book3[3];

		// 객체 생성 후 배열에 저장
		books[0] = new Book3("자바 프로그래밍1", "홍길동1", 10000);
		books[1] = new Book3("자바 프로그래밍2", "홍길동2", 20000);
		books[2] = new Book3("자바 프로그래밍3", "홍길동3", 30000);
		// 출력
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
	}

}
