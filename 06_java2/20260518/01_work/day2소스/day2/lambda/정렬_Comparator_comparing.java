package day2.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 정렬_Comparator_comparing {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();

		// 학생 추가
		studentList.add(new Student("홍길동", 20));
		studentList.add(new Student("김철수", 22));
		studentList.add(new Student("박영희", 19));
		
		 
		Collections.sort( studentList, Comparator.comparing( s -> s.getName()));
	//	Collections.sort( studentList, Comparator.<Student, String>comparing( s -> s.getName()));
		//  타입을 명시함
	  
		studentList.forEach( s -> System.out.println( s.getName()  + s.getAge()));
		
	 
	 
	}

}
