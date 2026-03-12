
public class 함수사용이유_중복코드제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		양치질하기(); // call
		양치질하기(); // call
		양치질하기(); // call
		양치질하기(); // call
	}
	
	// 함수로 분리하면 중복코드 제거, 유지보수 용이
	// 코드의 집중화가 됨 >> 고칠때 여기만 봐
	public static void 양치질하기() {
		System.out.println("1. 치약 짬");
		System.out.println("2. 이를 닦음");
		System.out.println("3. 헹굼");
	}

}
