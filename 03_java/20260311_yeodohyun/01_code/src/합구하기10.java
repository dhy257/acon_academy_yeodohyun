
public class 합구하기10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	// 기능" 1~10합 구하기
	// 매개변수(입력): x
	// 반환:10까지 합

	public static int genToTal() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			return sum;
		}
		return sum;
	}
}
