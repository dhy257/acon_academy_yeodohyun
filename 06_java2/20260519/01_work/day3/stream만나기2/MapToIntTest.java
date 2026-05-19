package day3.stream만나기2;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class MapToIntTest {

	public static void main(String[] args) {
	  /*	  
	   * mapToInt( )   변환될 때 기본형스트림으로 제공받는다 	      
	   * 기본형스트림이 제공하는 다른 기능들을 사용할 수 있다
	   * summaryStatistics 기능 사용
	   */

		Score[] list =  {
		  new Score("김길동",1,100) , 
		  new Score("김길동",1,100) ,
		  new Score("김길동",1,90) ,
		  new Score("김길동",1,100)  ,
		  new Score("김길동",1,100)  ,
		  new Score("김길동",1,80) ,
		  new Score("김길동",1,100) 		
		};
		
		
		Stream<Score> streamList = Stream.of( list);
		IntSummaryStatistics  is =streamList.mapToInt( s -> s.getKor()).summaryStatistics();
		
		System.out.println(is.getCount());
		System.out.println(is.getSum());
		System.out.println(is.getAverage());
		System.out.println(is.getMin());
		System.out.println(is.getMax());
		
	}

}
