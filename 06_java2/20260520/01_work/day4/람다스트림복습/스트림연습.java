package day4.람다스트림복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Movie  implements Comparable<Movie> {
    private String title;
    private String director;
    private int year;

    // 생성자
    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    // Getter 메서드
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    // toString 메서드 (영화 정보를 출력하기 쉽게)
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                '}';
    }

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return  this.year  - o.year;    // 
	}
}

public class 스트림연습 {
    public static void main(String[] args) {
        // Movie 객체를 담을 ArrayList 생성
        ArrayList<Movie> movies = new ArrayList<>();

        // Movie 객체 10개 추가
        movies.add(new Movie("기생충", "봉준호", 2019));
        movies.add(new Movie("올드보이", "박찬욱", 2003));
        movies.add(new Movie("신과 함께: 죄와 벌", "김용화", 2017));
        movies.add(new Movie("범죄도시", "강윤성", 2017));
        movies.add(new Movie("관상", "한재림", 2013));
        movies.add(new Movie("암살", "최동훈", 2015));
        movies.add(new Movie("부산행", "연상호", 2016));
        movies.add(new Movie("살인의 추억", "봉준호", 2003));
        movies.add(new Movie("명량", "김한민", 2014));
        movies.add(new Movie("해운대", "윤제균", 2009));

        // 영화 목록 출력
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        
        
        //스트림 
        
        
        //영화정보 출력하기
        
        Stream <Movie>   stream  =movies.stream();
        stream.forEach( item -> System.out.println( item.getTitle()));
        
        
        
        // 2015년 이후 영화 정보 조회
        stream  =movies.stream();
        stream.filter( item  ->  item.getYear() >=2015).forEach(  item  -> System.out.println( item));
        
         
        
        // 영화이름만  List 변환  
        
         stream  =movies.stream(); 
         List<String>  titles =stream.map( item  ->  item.getTitle()).collect(Collectors.toList());         
         titles.forEach( item -> System.out.println( item));
         
         
         for( String s : titles) {
        	 System.out.println( s);
         }
         
          
        
        
        // 영화이름과 감독을  Map( 키:영화이름, 값:감독) 변환 
         
         stream  =movies.stream(); 
         Map<String, String> movieMap = stream.collect( Collectors.toMap(item -> item.getTitle(), item->item.getDirector()));
        
         
         movieMap.forEach( (a, b) -> System.out.println("영화:"+ a + "감독:" +b));
        
         
         String value  = movieMap.get("암살");
         System.out.println( value);
        // 년도기준으로 정렬
         
         
         stream  =movies.stream(); 
         System.out.println("영화년도 순 ");
         stream.sorted().forEach( item -> System.out.println( item));
         
         
         
         //
         System.out.println("영화제목 순 ");
         stream  =movies.stream(); 
         stream.sorted( ( o1,o2)->  o1.getTitle().compareTo( o2.getTitle())).forEach( item  -> System.out.println( item));
        
         
        
   
    }
}
