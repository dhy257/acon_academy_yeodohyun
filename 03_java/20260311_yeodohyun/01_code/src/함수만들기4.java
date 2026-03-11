
public class 함수만들기4 {
	// 입력: o >>
	// 반환: o >>
	public static int 두배만들기(int money) {

		// money, result => 두 배 만들기 매서드에서만 사용 가능한 지역변수
		int result = money*2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 두배만들기(1000);
		System.out.println(result);
	}

}
