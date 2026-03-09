
public class 배열1차원_정수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1차원배열: 기억장소의 집합
		// 같은 기억 장소(같은 자료형)의 데이터를 여러개 저장할 수 있는 연속된 기억공간
		// 자료형의 크기(같아야함) + 연속적 + 배열선언시 크기 지정 >> 이래야 배열 사용 가능

		// 기억장소에 접근방법
		// 배열이름[인덱스]를 사용하여 몇 번째 요소인지 접근한다
		// 인덱스: 배열이름으로 부터 떨어진 위치(크기만큼)
		// 배열명[0]: 의미 => 기준으로부터 0만큼 떨어진 위치에 첫번째 박스(기억장소)가 있다.

		int[] kors = new int[5]; // 배열은 자료형의 기본값으로 초기화 해 줌
//		int[] engs = new int[] { 90, 100, 85, 75, 99 }; // 초기화 값만큼 배열을 만들고 값을 넣어줌
		int[] engs;
		engs = new int[] { 90, 100, 85, 75, 99 };

		int[] maths = { 100, 89, 79, 99, 88 }; // 초기화만큼 배열을 만들고 값 넣어줌, 한 라인에 배열을 만들고 초기화 할 때만 사용가능

		// 국어점수 배열 출력 >> 넣은게 없어서 int로 초기화된 0만 출력
		for (int i = 0; i < kors.length; i++)
			System.out.println(kors[i]);
	
		// 영어점수 배열 출력
		for (int i = 0; i < kors.length; i++)
			System.out.println(engs[i]); //배열명[인덱스]로 접근 => 기억(저장), 이용(읽기)
		
		// 수학점수 배열 출력
		for (int i = 0; i < kors.length; i++)
			System.out.println(maths[i]);

	}

}
