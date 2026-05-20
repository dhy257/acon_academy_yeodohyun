package day4prac.실습;

import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class Store {

	Cook cook;

	public void setCook(Cook cook) {
		this.cook = cook;
	}

	public void run() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n====== 한식당 ======");
			System.out.println("1. 주문하기");
			System.out.println("2. 메뉴보기");
			System.out.println("3. 요리하기");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");

			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("주문 완료!");
			}

			else if (menu == 2) {
				System.out.println("메뉴: 돼지불백 / 모둠쌈밥 / 된장찌개");
			}

			else if (menu == 3) {
				cook.porkBulgogi();
				cook.mixedWrapRice();
				cook.soybeanStew();
			}

			else if (menu == 4) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {

		Properties pp = new Properties();
		pp.load(new FileReader(
				"C:\\Users\\user\\Desktop\\acon_academy_yeodohyun\\06_java2\\20260520\\01_work\\day4prac\\실습\\config.txt"));

		String className = pp.getProperty("cook");
		System.out.println("로드된 요리사: " + className);

		Class clazz = Class.forName(className);
		Cook cook = (Cook) clazz.getDeclaredConstructor().newInstance();

		Store store = new Store();
		store.setCook(cook);

		store.run();
	}
}