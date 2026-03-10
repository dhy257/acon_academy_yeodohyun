
public class 약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 어떤 수 => 약수 출력
		// 약수 구하고 출력
		// 6의 약수 구하기 => 1 2 3 6
		
		/*
		 * 6/1 => 나눈 나머지 0이면 6의 약수 => 0임
		 * 6/2 => 나눈 나머지 0이면 6의 약수 => 0임
		 * 6/3 => 나눈 나머지 0이면 6의 약수 => 0임
		 * 6/4 => 나눈 나머지 0이면 6의 약수
		 * 6/5 => 나눈 나머지 0이면 6의 약수
		 * 6/6 => 나눈 나머지 0이면 6의 약수 => 0임
		 */
		int num=6;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.printf("%d는(은)"
						+ " %d의 약수\n",i,num);
			}
		}
		
		
	}

}
