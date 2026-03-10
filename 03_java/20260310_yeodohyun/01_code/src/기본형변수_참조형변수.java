
public class 기본형변수_참조형변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본형 변수: int, double, char, boolean
		// 프로그램에서 실제적으로 사용되는 데이터 값을 저장하는 변수
		int score = 90; // 90점
		char b = 'A'; // 'A' 문자 데이터 값 자체
		double c = 25.6; // 25.6 온도 데이터 값 자체
		boolean d = true; // 참 또는 거짓의 데이터 값 자체
		
		// 배열 만들기
		// int arr[10]; => 이런식으로 배열 못만듬(자바에선)
		
		// 자바에서는 배열부터는 new 힙메모리를 사용해야함
//		int arr[] = new int[10];
		int[] arr= new int[10];
		
		// 1. int형 크기 10개를 힙메모리에 확보
		// 2. 위에서 확보된 메모리의 시작주소를 반환
		// 3. 주소를 기억할 참조형변수(주소를 저장하는 변수)가 필요함
		// 4. arr는 반환된 주소(공간이 확보된 메모리의 시작주소)
		// new가 나오면 참조형변수가 필연적임
		
	}

}
