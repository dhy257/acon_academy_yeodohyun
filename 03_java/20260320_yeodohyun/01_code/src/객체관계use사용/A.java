package 객체관계use사용;

import java.util.Arrays;

public class A {
	public void 화폐매수구하기(MyUtil util) {
		int[] result = util.화페매수구하기(3521220);
		
//		Arrays.toString(result);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
