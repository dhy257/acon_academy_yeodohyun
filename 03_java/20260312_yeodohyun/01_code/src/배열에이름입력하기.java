
import java.util.Scanner;

public class 배열에이름입력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] names = new String[5]; // names는 참조형 변수, (배열의)위치정보 저장함

		inputNames(sc, names); // call by reference
		printNames(names);
	}

	// 입력하기
	public static void inputNames(Scanner sc, String[] names) {
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
	}

	// 출력하기
	public static void printNames(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}
}
