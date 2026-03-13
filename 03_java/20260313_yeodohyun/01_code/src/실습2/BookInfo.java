package 실습2;

public class BookInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Book book1 = new Book("코드로 배우는 스프링 부트 웹 프로젝트", "구멍가게 코딩단", 34000);
//		Book book2 = new Book("처음해보는 Servlet&JSP 웹 프로그래밍", "오정임", 28000);

		Book[] books = new Book[2];

		books[0] = new Book();
		books[1] = new Book();

		books[0].inputBook("코드로 배우는 스프링 부트 웹 프로젝트", "구멍가게 코딩단", 34000);
		books[1].inputBook("처음해보는 Servlet&JSP 웹 프로그래밍", "오정임", 28000);

		books[0].printBook();
		books[1].printBook();

	}

}
