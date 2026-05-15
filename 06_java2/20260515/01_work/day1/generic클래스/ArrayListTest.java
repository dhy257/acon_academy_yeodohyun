package day1.generic클래스;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {	 
		
		
		
		ArrayList<Score> list = new ArrayList<>();		
		list.add(new Score( "홍길동", 99 ,100));
		list.add( new Score( "김길동", 100,99));		
		
		for( int i=0; i< list.size() ; i++) {
			//System.out.println( list.get(i));
			System.out.println( list.get(i).getName());
		}				 
		
		// 제네릭이전 버전	 row 버전	
		ArrayList list2 = new ArrayList();
		list2.add(new Score( "홍길동", 99 ,100));
		list2.add( new Score( "김길동", 100,99));
		
		
		for( int i=0; i< list2.size(); i++) {			
			Object o  = list2.get(i);			
			Score score  = (Score)o;  // //다운캐스팅 
			System.out.println(  score.getName());			
		}
		
		
		
		
		
		
		
		
		

	}

}
