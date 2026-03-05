package code;

public class 연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// i++, ++i, i--, --i
		// ++i(전위형)
		// --i(후위형)
		
		// 공통점: 변수의 값을 1증가
		// 다른점: 연산의 결과가 다르다
		int a=10;
		int b=10;
		
		a++; // 연산의 결과 10 => a=11
		++b; // 연산의 결과 11 => b=11
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println(a++);
		
		System.out.println(++b);

	}
	

}
