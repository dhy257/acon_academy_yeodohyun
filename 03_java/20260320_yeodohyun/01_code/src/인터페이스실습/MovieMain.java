package 인터페이스실습;

import java.util.Scanner;

public class MovieMain {

	Reserve movieReserve; // 인터페이스 의존

	Payment p;

	public void setReserve(Reserve reserveService) {
		this.movieReserve = reserveService;
	}

	public void setP(Payment p) {
		this.p = p;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

//		p = new CardPayment();
		Management management = new Management();
		Payment card = new CardPayment();
		Payment cash = new CashPayment();
		Payment kakao = new KakaoPay();

		Movie[] movies = new Movie[3];

		for (int i = 0; i < movies.length; i++) {
			movies[i] = new Movie();
		}

		movies[0].inputMovie("Interstellar", "SF", 10000, 10);
		movies[1].inputMovie("Avengers", "Action", 20000, 5);
		movies[2].inputMovie("LaLaLand", "Musical", 30000, 8);

		int totalSales = 0;

		while (true) {

			System.out.println("\n===== Movie List =====");

			for (int i = 0; i < movies.length; i++) {
				System.out.print((i + 1) + ". ");
				movies[i].printInfo();
			}

			System.out.println("0. Exit");

			System.out.print("Select movie: ");
			int choice = sc.nextInt();

			if (choice == 0)
				break;

			int price = movieReserve.reserve(movies[choice - 1]);

			if (price > 0) {
				// 선택된 Payment 객체를 재사용
				// management에서 받은 p가지고
				Payment p = management.select();
				// p.pay실행
				if (p.pay(price)) {
					System.out.println(movies[choice - 1].movieName + " 예약 성공");
					System.out.println("남은 좌석: " + movies[choice - 1].seat);
					totalSales += price;
				} else {
					// 결제 실패 => 좌석 복구
					movies[choice - 1].seat++;
					System.out.println("결제 실패 → 예약 취소");
				}
			}
		}

		System.out.println("총 매출: " + totalSales);
		sc.close();
	}

	public static void main(String[] args) {

		MovieMain m = new MovieMain();

		// 일반 객체 주입
		m.setReserve(new MovieReserve());

		// 익명 클래스
//		m.setReserve(new Reserve() {
//
//			@Override
//			public int movieReserve(Movie movie) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});

		m.run();
	}
}