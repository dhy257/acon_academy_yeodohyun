package 학생.송주창;

import java.util.Arrays;

public class 구구단Service {
	
	// 기능: 3단 제공
	// 입력: x
	// 반환: String[]
	
	public String[] get구구단3() {
		String[] dan3 = new String[9];
		
		for(int i = 0; i < 9; i++) {
			dan3[i] = "3X"+(i+1)+"="+3*(i+1);
		}
		
		return dan3;
	}
	
	public static void main(String[] args) {
		구구단Service service = new 구구단Service();
		String[] result = service.get구구단3();
		System.out.println(Arrays.toString(result));
	}
}
