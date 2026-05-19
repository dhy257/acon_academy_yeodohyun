package day3.stream만나기2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class 스트림사용하기2 {

	public static void main(String[] args) {
	 
		Score[] list =  {
		  new Score("김길동",1,100) , 
		  new Score("김길동",1,100) ,
		  new Score("김길동",1,90) ,
		  new Score("김길동",1,100)  ,
		  new Score("김길동",1,100)  ,
		  new Score("김길동",1,80) ,
		  new Score("김길동",1,100) 		
		};
		
		Stream<Score> streamList = Stream.of(  list);		
		streamList.filter( t -> t.getKor()==80 ).forEach( s ->System.out.println(s));
			
	}

}
