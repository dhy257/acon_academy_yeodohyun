package 실습_김민경_여도현;

public class MovieReserve implements Reserve {
	@Override
	public int reserve(Movie movie) {
		if (movie.seat > 0) {
			movie.seat--;
			
			Management p = new Management();
			
			boolean result = p.select(movie.price);
			
			if (!result) {
	            System.out.println("예약 실패 (잔액 부족)");
	            return 0;
	        }

			
			System.out.println(movie.movieName + " 예약 성공");
			
			System.out.println("남은 좌석: " + movie.seat);
			return movie.price;
		} else {
			System.out.println("좌석이 없습니다");
			return 0;
		}
	}
}
