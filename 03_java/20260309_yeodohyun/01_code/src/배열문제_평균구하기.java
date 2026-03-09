
public class 배열문제_평균구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kors = { 100, 99, 85, 75, 88 };

		// 평균을 구하시오
		// 1.반복
		// - 총합 구하기

		// 2.평균 구하기

		int total = 0;
		double avg;
		total = kors[0] + kors[1] + kors[2] + kors[3] + kors[4];
		avg = (double) total / kors.length; // 정수/정수 => 정수
		System.out.println(avg);

		int sum = 0;
		double avg1;
		
		for(int i=0;i<kors.length;i++) {
			sum+=kors[i];
		}
		avg1 = sum/(double)kors.length;
		System.out.println(avg1);
	}

}
