package code;

public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형: 자료형(type)
		// 형변환: type 변환

		byte b = 127;
//		byte c=128; // 작은공간 = 큰값; >> 오류
		byte c = (byte) 128;
		System.out.println(c);

		int su1 = 10;
		int su2 = 3;

		double result;
		result = su1 / su2; // 결과 3이 나오고 3.0 으로 바뀜(double)
		System.out.println(result);
		result = su1 / (double) su2; // 더 큰 뒤의 double 이 기준 >> 3.3333..
		System.out.println(result);

		// 항변환
		// 큰변수 = 작은변수 => 작은변수의 type을 큰 변수의 타입으로 형변환 시도(auto)
		// 작은변수 = 큰변수 => 큰변수의 타입을 작은변수의 타입으로 바꿈(강제 => 명시적으로 들어내야 함)

		double score = 98.56;
		float kor = (float) score; // 작은변수에 큰 값 넣기 => double을 float으로 바꾸기
		System.out.println(score);
		
		float score2 = 98.34f;
		double kor2 = score2; // 자동형변환
		// 큰 공간 = 작은 값
		// 작은공간 = 큰 값 (명시적 형변환해서 쓰거나 아니면 타입을 맞춰서 사용하거나)

	}

}
