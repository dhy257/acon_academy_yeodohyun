package day1.매서드매개변수_와일드카드;

import java.util.ArrayList;

public class 와일드문자맛보기 {

	public static void main(String[] args) {
		 
		
		
		
		
		//  불가능
		//ArrayList<Object> list= new ArrayList<String>();
		
	 
		//가능
		
		
		// 
		
		ArrayList<? extends Object> testlist= new ArrayList<String>();
		
		
		//보통 와일드 카드 문자는 참조할 떄 사용됨
		
		
		ArrayList<String> strList  = new ArrayList<>();
		strList.add("acorn");
		strList.add("web project");
		strList.add("mvc 뽀개기");
		strList.add("서비스 개념 익히기");
		strList.add("모델 -");
		
		
		ArrayList<?>  list  = strList;
		
		
		for( Object item :  list) {
			System.out.println( item);
		}
		
		
		
		
		
		

	}

}
