package day5prac.재귀호출;

public class 합10재귀3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getSumR(10);
		System.out.println(result);
	}

	public static int getSumR(int su) {
		if (su == 1) {
			return 1;
		} else {
			return su + getSumR(su - 1);
		}
	}
	
	
	// getSumR(10)
	// 		10+getSumR(9)
	//			9+getSumR(8)
	// 		...
	//				2+getSumR(1)
	//					1
	
}
