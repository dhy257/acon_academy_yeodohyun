package string;

public class 문자열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수영역에 "hello"라는 문자열이 저장되고 공유하면서 사용
		String str1 = "hello";
		String str2 = "hello";

		// 얘네는 주소 다름(new니까 별도의 공간에 hello 2개)
		String str3 = new String("hello");
		String str4 = new String("hello");

		// 예상해보기
		// 두 문자열은 주소, 내용이 같은가?

		if (str3.equals(str4)) { // 문자열의 내용 비교
			System.out.println("내용같음");
		} else {
			System.out.println("둘 내용 다름ㅇ");
		}
		if (str1 == str2) {
			System.out.println("두 주소가 같다");
		} else {

			System.out.println("두 객체 주소 다름");
		}

	}

}
