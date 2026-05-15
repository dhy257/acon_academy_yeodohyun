package day1.wrapper;

public class 래퍼클래스Main {

	public static void main(String[] args) {

		int a = 10;
		// 기본형 → 객체(박싱)
		Integer num = Integer.valueOf(a);

		// 객체 → 기본형(언박싱)
		int b = num.intValue();

		System.out.println(num); // 10
		System.out.println(b); // 10

		//오토박싱
		Integer su = 10;
		
		//오토언박싱
		int su2 = su;
		
		
		System.out.println( su2);
	}

}
