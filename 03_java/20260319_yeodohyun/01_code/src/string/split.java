package string;

import java.util.Arrays;

public class split {
	public static void main(String[] args) {
		String str = "i-love-java"; // 문자열배열은 반드시 문자열객체.매서드 로만 사용

		String[] result = str.split("-");

		System.out.println(Arrays.toString(result));
	}
}
