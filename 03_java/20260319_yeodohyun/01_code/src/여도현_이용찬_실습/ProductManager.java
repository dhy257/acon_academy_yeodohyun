package 여도현_이용찬_실습;

import java.util.Scanner;

public class ProductManager {
	// 상품들
	private Product[] products;
	Scanner sc = new Scanner(System.in);

	// 상품들 가져옴
	public ProductManager(Product[] products) {
		this.products = products;
	}

	// 전체 상품 보여주기
	public void showAll() {
		// 가져온 상품들 길이만큼 => 다 보여줌
		for (int i = 0; i < products.length; i++) {
			System.out.println("상품번호: " + i);
			products[i].showInfo();
			System.out.println("=============================");
		}
	}

	// 물품 판매
	public void sellProduct(int index, int amount) {
		products[index].sell(amount);
	}

	// 재고 추가(개별)
	public void addStock(int index, int amount) {
		products[index].addStock(amount);
	}

	// 재고 자동추가
	public void Restock() {
		for (int i = 0; i < products.length; i++) {
			// 재고가 3개 미만이면 재고추가
			if (products[i].quantity < 3) {
				System.out.println(products[i].name + " 채움");
				// 10개 추가
				products[i].addStock(10);
			} else {
				System.out.println(products[i].name + "재고가 충분함");
			}
		}
	}

	// 최종 수행
	public void runMenu() {
		while (true) {
			System.out.println("\n===== 상품 관리 =====");
			System.out.println("1. 전체 조회");
			System.out.println("2. 판매");
			System.out.println("3. 재고 채우기");
			System.out.println("4. 자동 재고 관리");
			System.out.println("0. 종료");
			System.out.print("선택: ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			switch (menu) {
			case 1:
				showAll();
				break;
			case 2:
//				showAll(); // 판매 전에 목록 보여주기
				System.out.print("상품 번호 선택: ");
				int sellIndex = sc.nextInt();
				System.out.print("판매 수량 입력: ");
				int amount = sc.nextInt();
				sellProduct(sellIndex, amount);
				break;
			case 3:
//				showAll(); // 재고 추가 전에 목록 보여주기
				System.out.print("상품 번호 선택: ");
				int addIndex = sc.nextInt();
				System.out.print("추가 수량 입력: ");
				int addAmount = sc.nextInt();
				addStock(addIndex, addAmount);
				break;
			case 4:
				Restock();
				break;
			default:
				System.out.println("잘못된 입력");
			}
		}

		System.out.println("프로그램 종료");
	}
}
