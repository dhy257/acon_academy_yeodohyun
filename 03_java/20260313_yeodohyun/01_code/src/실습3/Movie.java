package 실습3;


class Movie {

	String movieName;
	String genre;
	int price;
	int seat = 10;

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
}
