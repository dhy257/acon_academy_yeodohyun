import java.util.Scanner;

public class 동적메모리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 동적메모리: 프로그램을 실행시켰을 때 실제사용할 메모리의 크기가 결정됨
		// 자바에선 new를 사용해 동적메모리 할당
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 결정해 입력해주세요 1~100");
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		// 만든 배열 출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
