
public class 함수_지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두 수 더하기
		
		int sum;
		int num1=10;
		int num2=5;
		sum=num1+num2;
		
		System.out.println(sum);
		System.out.println(adder(num1,num2));
	}
	
	public static int adder(int num1, int num2) {
		int sum;
		sum=num1+num2;
		return sum;
	}

}
