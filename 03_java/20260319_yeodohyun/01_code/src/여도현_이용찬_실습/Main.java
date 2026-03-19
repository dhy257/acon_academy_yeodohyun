package 여도현_이용찬_실습;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Product[] products = new Product[5];

		products[0] = new Electronics("노트북", 1000000, 1, 7, "13인치");
		products[1] = new Electronics("마우스", 30000, 10, 14, "중간");
		products[2] = new Snack("새우깡", 1500, 10, 14, 100);
		products[3] = new Snack("맛동산", 3000, 10, 1, 300);
		products[4] = new Bag("가방", 32000, 10, 14, "중간");

		ProductManager manager = new ProductManager(products);
		manager.runMenu();

	}
}