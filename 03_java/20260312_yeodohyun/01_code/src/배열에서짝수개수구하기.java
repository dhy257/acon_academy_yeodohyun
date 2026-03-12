
public class 배열에서짝수개수구하기 {

	// 자바에서 코드 작성법
	// 반드시 클래스가 있어야 함
	// 실행가능한 클래스가 되려면 반드시 약속된 main매서드가 존재해야함

	// 기능: 인사
	// 입력: x
	// 반환: x
	public static void hi() {
		System.out.println("hello java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 코드작성
//		System.out.println("hello java");
		hi();
		
		System.out.println(checkEven(new int[] {1,2,2,3,4,5}));

	}

	// 기능: 배열에서짝수개수구하기
	// 입력: 배열
	// 반환: 짝수갯수
	public static int checkEven(int[] nums) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				cnt++;
			}
		}

		return cnt;
	}

}
