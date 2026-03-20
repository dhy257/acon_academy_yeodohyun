package 실습_김민경_여도현;

class Movie {
	String movieName;
	String genre;
	int price;
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
}