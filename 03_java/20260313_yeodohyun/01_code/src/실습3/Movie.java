package 실습3;

import java.util.Scanner;

class Movie {

	String movieName;
	String genre;
	int price;
//	int seat = 10;
	int seat;

	public void inputMovie(String moviename, String genre, int price, int seat) {
		this.movieName = moviename;
		this.genre = genre;
		this.price = price;
		this.seat = seat;

	}

	public void printInfo() {
		System.out.println(movieName + " / " + genre + " / " + price + "원 / 좌석:" + seat);
	}

	public int reserve() {

		if (seat > 0) {
			seat--;
			System.out.println(movieName + " 예약 성공");
			System.out.println("남은 좌석: " + seat);
			return price;
		} else {
			System.out.println("좌석이 없습니다");
			return 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Movie[] movies = new Movie[3];

		for (int i = 0; i < movies.length; i++) {
			movies[i] = new Movie();
		}

		movies[0].inputMovie("Interstellar", "SF", 10000, 10);
		movies[1].inputMovie("Avengers", "Action", 20000, 5);
		movies[2].inputMovie("LaLaLand", "Musical", 30000, 8);
		/*
		 * // movies[0].movieName = "Interstellar"; // movies[0].genre = "SF"; //
		 * movies[0].price = 12000; // // movies[1].movieName = "Avengers"; //
		 * movies[1].genre = "Action"; // movies[1].price = 13000; // //
		 * movies[2].movieName = "LaLaLand"; // movies[2].genre = "Musical"; //
		 * movies[2].price = 11000;
		 */
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

			if (choice >= 1 && choice <= 3) {
				totalSales += movies[choice - 1].reserve();
			}

		}

		System.out.println("총 매출: " + totalSales);
		sc.close();
	}
}
