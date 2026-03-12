
import java.util.Scanner;

public class 배열에이름입력하기 {
	
	// 참조형변수: 위치(주소)를 저장하는 변수
	// 이유) 배열부터는 new를 사용해서 메모리를 확보하고 사용해야함
	// new => 메모리확보하고 주소를 반환함, 주소를 저장하고 사용할 일이 발생함

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
