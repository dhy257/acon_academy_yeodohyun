package day2prac.lambda.function;

import java.util.Arrays;
import java.util.function.Function;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, String[]> f1 = new Function<Integer, String[]>() {

			@Override
			public String[] apply(Integer t) { // 숫자 -> String[] 반환
				// TODO Auto-generated method stub

				String[] result = new String[t];
				for (int i = 0; i < result.length; i++) {
					result[i] = "화이팅" + (i + 1);
				}
				return result;
			}
		};

		String[] r = f1.apply(3);
		System.out.println(Arrays.toString(r));

		//
		Function<Integer, String[]> f2 = (num) -> {

			String[] result = new String[num];
			for (int i = 0; i < result.length; i++) {
				result[i] = "화이팅" + (i + 1);
			}
			return result;
		};
		String[] r2 = f2.apply(5);
		System.out.println(Arrays.toString(r2));

	}

}
