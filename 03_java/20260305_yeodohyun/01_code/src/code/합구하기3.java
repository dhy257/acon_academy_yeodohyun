package code;

public class 합구하기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su = 0;
		int result = 0;

//		su+=1; //1
//		result+=su; //1
//		System.out.println(result);
//		
//		su+=1; //2
//		result+=su; //3
//		System.out.println(result);
		for (int i = 1; i <= 10; i++) {
			su += 1;
			result += su;
		}
		System.out.println(result);

		for (int i = 1; i <= 2; i++) {
			System.out.println("hello");
		}
	}

}
