
public class 가장높은온도구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] temperatures = { 33, 35, 32, 35, 36, 35, 34 };
		
		int max=temperatures[0];
		
//		if(temperatures[1]>max) {
//			max = temperatures[1];
//		}
//		if(temperatures[2]>max) {
//			max = temperatures[2];
//		}
//		if(temperatures[3]>max) {
//			max = temperatures[3];
//		}
//		if(temperatures[4]>max) {
//			max = temperatures[4];
//		}
//		if(temperatures[5]>max) {
//			max = temperatures[5];
//		}
		for(int i=0;i<temperatures.length;i++) {
			System.out.printf("갱신된 최고온도: %d도\n",max);
			if(temperatures[i]>max) {
				max=temperatures[i];
			}
		}
		
		System.out.println(max);
		
	}

}
