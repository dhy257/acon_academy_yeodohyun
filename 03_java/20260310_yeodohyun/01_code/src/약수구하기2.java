
public class 약수구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력: 어떤 수 su
		// 출력: 약수배열 약수(su)

		int su = 6;
		int[] 약수 = new int[su];

		int index = 0; // 약수 발견 시 카운트 증가 >> 약수배열 index
		
		/*
		 * 약수
		 * 0	1	2	3	4	5	6
		 * 1	2	3	6
		 * 
		 * i=1
		 * 6%1=> 나머지0
		 * 6%2=> 나머지0
		 * 6%3=> 나머지0
		 * 6%4=> 나머지2
		 * 6%5=> 나머지1
		 * 6%6=> 나머지0
		 */
		for (int i = 1; i <= su; i++) {
			if (su % i == 0) {
				약수[index] = i;
				index++;
			}
		}

		for (int i = 0; i < index; i++) {
			System.out.println(약수[i]);
		}

		//
	}

	
}
