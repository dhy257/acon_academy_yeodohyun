
public class 배열에서짝수개수구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 함수를 만들기 힘들면
		// 메인에서 동작하는 프로그램으로 작성

		int[] nums = { 1, 2, 3, 4, 5, 4, 3 };

		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				cnt++;
				System.out.printf("%d - %d\n",nums[i],cnt);
			}
		}
		System.out.printf("총 짝수 개수: %d\n",cnt);
		
		// 위의 코드를 보고 아래 작성 or Alt + Shift + M
		// 기능: 정수배열에서 짝수 구하기
		// 입력: 정수배열
		// 반환: 짝수개수
		
		System.out.println("아래는 함수 사용");
		checkEven(nums);
		
	}
	
	public static int checkEven(int[] nums) {
		int cnt = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				cnt++;
				System.out.printf("%d - %d\n",nums[i],cnt);
			}
		}
		System.out.printf("총 짝수 개수: %d",cnt);
		
		return cnt;
	}

}
