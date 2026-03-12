
public class 클래식변수static변수 {

	static int index = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int index = 0;// index를 메인에서 만들면 계속 전달하고 증가된 값은 반환받아서 사용해야함
		// 클래스내에 있는 모든 매서드가 함께 사용할 수 있는 클래스 전역변수로 만들 수 있다 => main 위 클래스 안쪽에
		s수증가하기();
		s수출력하기();
	}

	private static void s수출력하기() {
		// TODO Auto-generated method stub
		System.out.println(index);
	}

	private static void s수증가하기() {
		// TODO Auto-generated method stub
		index++;
	}

}
