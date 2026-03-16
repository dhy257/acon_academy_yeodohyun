package 접근제한자;

public class Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A(); // A type(A class)로 객체 만들기 => 변수 만들기
		
		// a.a=10; private 외부에서 접근불가
		a.b = 10; // public 외부에서도 ok
		a.c = 5; // A와 Other는 같은 폴더, 같은 패키지이므로 접근 가능
	}

}
