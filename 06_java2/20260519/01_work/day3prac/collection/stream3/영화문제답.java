package day4prac.복습.영화문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
 
//스트림: 데이터흐름 
//선언식방법으로 데이터를 편리하게 처리하게 해줌 
//filter(필터링), map(변환) , collect(수집)

public class 영화문제답 {

	public static void main(String[] args) {
		
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
        
        
        //스트림
        
        //1. 영화 목록 출력하기 
         movies.stream().forEach( ( item )->{
        	 System.out.println( "******");
        	 System.out.println(item.getTitle());
        	 System.out.println(item.getYear());
        	 System.out.println( "******");
         });
        
        
        
        //2.2015년 이후 영화 정보 조회    // (item  )->{ return  item.getYear()>2015 ;}
         movies.stream().filter( item -> item.getYear() >=2015).forEach(item-> System.out.println( item));
        
        
        //3. 영화이름만  List 만들기 
         
       List<String> titleList  =  movies.stream()
    		   .map( ( item )->{ return item.getTitle();}).collect(Collectors.toList());
        
        
       System.out.print( titleList);
        
        //4. 영화이름과 감독을   HashMap(  키:영화이름, 값:감독 )변환
       
       
       Map<String, String> moviemap= movies.stream()
    		   .collect( Collectors.toMap( item -> item.getTitle(), item -> item.getDirector()));
        
        
       
       System.out.println(moviemap);
       
       
        
        //5.정렬  (기본정렬-객체내부에 있는  Comparable)
        System.out.println("=== 년도순 정렬");
        movies.stream().sorted().forEach(item  -> System.out.println( item));
        
        
        //6.정렬(  Comparator )
        System.out.println("=== 타이틀 정렬");
        movies.stream().sorted( ( o1, o2)->{ return o1.getTitle().compareTo(o2.getTitle()); })
        .forEach( item -> System.out.println( item));

	}

}
