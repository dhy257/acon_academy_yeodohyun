package code;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 논리연산자 &&, ||, !
		int kor = 80;
		int eng = 90;
		boolean result = (kor >= 90) && (eng >= 90); // true && true => 참, false && true => false
		boolean result2 = (kor >= 90) || (eng >= 90); // false && false => 거짓, 하나라도 참이면 참

		boolean result3 = kor >= 90; // false
		boolean result4 = !(kor >= 90); // 조건 부정 => true

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
