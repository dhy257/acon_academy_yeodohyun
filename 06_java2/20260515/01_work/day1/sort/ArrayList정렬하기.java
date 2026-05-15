package day1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList정렬하기 {

	public static void main(String[] args) {
		
		//배열, 객체 => new를 통해서 메모리 확보		
		Score score  = new Score("홍길동",100);
		
		
		ArrayList<Score > list  =new ArrayList<>();		
		
		list.add( new Score("김길동", 100 ));
		list.add( new Score("홍길동", 75 ));
		list.add( new Score("박길동", 95 ));
				
		
		 
		Collections.sort( list);
		
		
		
		System.out.println( "정렬 후 ");
		
		for( Score s  : list) {
			System.out.println( s);
		}
		
		
		
		//다른 기준으로 정렬할 때
		
		Collections.sort( list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				// TODO Auto-generated method stub
				return o1.kor -o2.kor;
			}});
		
		
		
		System.out.println(  list);
		
		
		//람다식으로
		Collections.sort( list,   (o1, o2)-> o2.kor-o1.kor);
		
		System.out.println(   list);
		
		
		 // Comparator 사용한 정렬 (오름차순)
        Collections.sort(list, Comparator.comparing( s -> s.getKor()));
        System.out.println(list);
        
  
		
		

	}

}
