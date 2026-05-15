package day1.generic매서드;

public class 제네릭매서드맛보기 { 
	
	public static void print1(String a) {
		System.out.println(a);
	}
	
	public static void print2(int b) {
		System.out.println(b);
	}
	
	public static void print3(char c) {
		System.out.println(c);
	}
	 
	
	// 제네릭매서드로 만들기  T=> 타입변수
	public static <T> void  print( T  a) {
		System.out.println( a);
	}
	
		
	public static void main(String[] args) {	
		
		//static 매서드 3개 만들기		
		//1. 출력하기 (반환 x , 매개변수  String)
		//2. 출력하기 (반환 x,  매개변수 int)
		//3. 출력하기 (반환 x , 매개변수  char )		
		제네릭매서드맛보기.print1("hi");
		제네릭매서드맛보기.print2(15);
		제네릭매서드맛보기.print3('A');
		
		
		
		// 위와 아래의 차이 확인 !!
		
		제네릭매서드맛보기.<String>print("hello");
		제네릭매서드맛보기.<Integer>print(11);    // int   -> Integer 
		제네릭매서드맛보기.<Character>print('B');  //char  -> Character
		
		 
		제네릭매서드맛보기.print("hello");
		제네릭매서드맛보기.print(11);
		제네릭매서드맛보기.print('B');
		

	}
	
	
	

}
