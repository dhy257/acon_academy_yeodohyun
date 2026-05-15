package day1.builder;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m = Movie.builder()
		        .name("기생충")
		        .director("봉준호")
		        .build();

		System.out.println(m.getName());
	}

}
