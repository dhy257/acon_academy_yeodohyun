package day3.collection;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

 

public class SetEx2 {

	public static void main(String[] args) {
	
		// set :  중복허용 x , 순서 x
		// String 클래스는 이미 equals를 재정의 하였다.		
		// 사용자가 만든  객체인 경우에 같다는 것을  equals를 재정의 해야 한다
		
		// 개발자가 직접 오버라이드 해줘야 함 !!
		// 소스  ->  generate  (  hashcode & equals  오버라이드 하여 같은 객체로 인식되게 해야 함) 
	
		
		Set<Moving> set = new HashSet<>();
		set.add(new Moving("장주원","구룡포",100));
		set.add(new Moving("이미현","경기",80));
		set.add(new Moving("김두식","문산",90));
		set.add(new Moving("장주원","봉평",88));  //해시코드도 같고    equals의 값도 true이므로  추가되지 않음
	 
		
		set.forEach( item -> System.out.println( item));
		
		
		  

	}

}
