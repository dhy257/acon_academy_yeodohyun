package day1prac.제네릭매서드;

public class 제네릭매서드만들기 {

	// 제네릭은 반드시 객체타입이어야 한다
	// 기본형 : wrapper 클래스 사용 ( 자동임 )
	public static <T> void print(T item) {
		System.out.println(item);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		제네릭매서드만들기.<Integer>print(7);
		제네릭매서드만들기.print("String");
		제네릭매서드만들기.print(125.25);
		제네릭매서드만들기.<Acorn>print(new Acorn("acorn1", "김건희"));
	}

}
