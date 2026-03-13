package 실습3;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Movie[] movies = new Movie[3];

		for (int i = 0; i < movies.length; i++) {
			movies[i] = new Movie();
		}

		movies[0].movieName = "Interstellar";
		movies[0].genre = "SF";
		movies[0].price = 12000;

		movies[1].movieName = "Avengers";
		movies[1].genre = "Action";
		movies[1].price = 13000;

		movies[2].movieName = "LaLaLand";
		movies[2].genre = "Musical";
		movies[2].price = 11000;

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

	}
}