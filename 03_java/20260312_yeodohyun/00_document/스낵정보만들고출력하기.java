package javaprj.day08.구조화된데이터;

public class 스낵정보만들고출력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//자료형   변수
		//int   a; 
		
		//배열, 객체는 변수를 만들때 (메모리를 사용할 때) 
		// new를 사용하여 변수를 만들 수 있다
		
	   //자료형  변수
		
		Snack snack  = new Snack(); //구조화된변수 만들기
		
		
		//값넣기		
		/*snack.name="맛동산";
		snack.company="해태";
		snack.calories="510";
		snack.gram=200;
		*/
		input(snack);   // call by reference
		
		//값출력하기	
		/*
		System.out.println(snack.name);
		System.out.println(snack.company);
		System.out.println(snack.calories);
		System.out.println(snack.gram);
		*/
		print(snack);
		
	}
	
	public static void  input(Snack snack) {
		snack.name="맛동산";
		snack.company="해태";
		snack.calories="510";
		snack.gram=200;
	}
	
	
	public static void print( Snack snack) {
		System.out.println(snack.name);
		System.out.println(snack.company);
		System.out.println(snack.calories);
		System.out.println(snack.gram);
	}

}
