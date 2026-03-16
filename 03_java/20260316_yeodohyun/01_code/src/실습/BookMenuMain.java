package 실습;

import java.util.Scanner;

public class BookMenuMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BookMenu[] books = new BookMenu[10];

		int count = 0;

		while (true) {

			System.out.println("1. 책 저장");
			System.out.println("2. 책 출력");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택: ");

			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {

				System.out.print("제목 입력: ");
				String title = sc.nextLine();

				System.out.print("저자 입력: ");
				String author = sc.nextLine();

				System.out.print("가격 입력: ");
				int price = sc.nextInt();
				sc.nextLine();

				books[count] = new BookMenu(title, author, price);
				count++;

			} else if (menu == 2) {

				for (int i = 0; i < count; i++) {
					System.out.println(books[i]);
				}

			} else if (menu == 3) {

				System.out.println("프로그램 종료");
				break;

			} else {

				System.out.println("잘못된 메뉴입니다.");

			}

		}

	}

}