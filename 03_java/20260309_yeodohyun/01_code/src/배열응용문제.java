import java.util.Scanner;

public class 배열응용문제 {

	public static void main(String[] args) {

//		3. 응용 배열문제    ( 배열의 크기는 10으로 한다 , 수는 10개 이내로 입력 )
//
//		   1)   수가 입력될 때  짝수만 배열에 담고 출력하기   (0이 입력되면 종료) 
//		     
//		   2)   배열의 평균값보다 큰 요소의 개수 구하기  
//		        int[]  Temperatures  =  { 33 ,35,32 ,35  ,36 ,35 ,34  }  ;
//		     
//
//		   3)   임의의 수가 입력되고  입력한 수에 대한 약수를 배열에 저장하고 출력하기     
//		       - 배열사용하지 않기  
//		       - 배열을 사용하여 약수를 모두 구한 후 한꺼번에 출력하기
//
//
//		  * 약수란? 12의 약수 : 1~12 중에서 12를 나누어 떨어지게 하는 수 
//		  (배열은 입력되 수의 개수로 정한다)
//		 
//		   입력된 수 15   => 배열을 15개로 한다 
//		   
//		   
//		   어떤 수 입력  ->               어떤수에 대한 약수를 배열에 저장하고 
//		                                  한꺼번에 출력하는 프로그램 작성
//
//		   12  -> 1  2  3  4  6 12  출력되어야 함
//
//		               
//		4) char 2차원배열(5*5)  배열을 만들고 배열의  테두리 요소에   '*' 넣기

		Scanner sc = new Scanner(System.in);

		// 1) 수가 입력될 때 짝수만 배열에 담고 출력하기 (0 입력 시 종료)

		int nums[] = new int[10];
		int cnt = 0;

		System.out.println("숫자 입력 (0 입력하면 종료)");

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("번호 %d 입력: ", i + 1);
			int num = sc.nextInt();

			if (num == 0) {
				break;
			}

			if (num % 2 == 0) { // 짝수이면 배열에 저장
				nums[cnt] = num;
				cnt++;
			}
		}

		System.out.println("배열에 저장된 짝수:");
		for (int i = 0; i < cnt; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println();

		// 2) 배열 평균보다 큰 요소 개수 구하기

		int[] Temperatures = { 33, 35, 32, 35, 36, 35, 34 };

		int sum = 0;
		for (int i = 0; i < Temperatures.length; i++) {
			sum += Temperatures[i];
		}

		double avg = (double) sum / Temperatures.length;

		int bigCnt = 0;
		for (int i = 0; i < Temperatures.length; i++) {
			if (Temperatures[i] > avg) {
				bigCnt++;
			}
		}

		System.out.println("평균: " + avg);
		System.out.println("평균보다 큰 요소 개수: " + bigCnt);

		// 3) 입력한 수의 약수를 배열에 저장 후 출력

		System.out.print("어떤 수 입력: ");
		int n = sc.nextInt();

		int divisor[] = new int[n];
		int dCount = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisor[dCount] = i;
				dCount++;
			}
		}

		System.out.println("약수 출력:");
		for (int i = 0; i < dCount; i++) {
			System.out.print(divisor[i] + " ");
		}

		System.out.println();

		// 4) char 2차원 배열(5x5) 테두리에 * 넣기

		char arr[][] = new char[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (i == 0 || i == 4 || j == 0 || j == 4) {
					arr[i][j] = '*';
				} else {
					arr[i][j] = ' ';
				}
			}
		}

		System.out.println("배열 출력:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}