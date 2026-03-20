package 인터페이스실습;

public class MovieReserve implements Reserve {

	@Override
	public int reserve(Movie movie) {
		if (movie.seat > 0) {
			movie.seat--;
			return movie.price;
//			System.out.println(movie.movieName + " 예약 성공");
//			System.out.println("남은 좌석: " + movie.seat);

		} else {
			System.out.println("좌석이 없습니다");
			return 0;
		}
	}
}
