package 이용찬_여도현_실습;

public class Main {

	public static void main(String[] args) {
		Manage manage = new Manage();
		Product apple = new Food("사과", 5000, 1, 17);
		Product book = new Goods("책", 20000, 2, 15);
		
		manage.addProduct(apple);
		manage.addProduct(book);
		
		book.showInfo();
		
		
		manage.remove();
		manage.refund(book);
		manage.showInfo();
	}
	
}
