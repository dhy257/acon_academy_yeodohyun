import java.util.Scanner;

public class 제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문에서 break 사용하면 자신이 속한 반복문 벗어남
		// 이름을 입력받아 그대로 출력
		// stop 입력되면 종료

		// 반복 횟수 정해지지 않았으니 while 사용

		String name = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			name = sc.nextLine();
			if(name.equals("stop")){
				// 문자열 비교 => 문자하나하나를 다 비교해서 true, false
				break;
			}
			System.out.println(name);
		}

	}

}
