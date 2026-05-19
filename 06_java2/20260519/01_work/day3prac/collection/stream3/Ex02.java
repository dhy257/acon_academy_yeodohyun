package day3prac.collection.stream3;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// random 스트림 얻어오기
		IntStream is = new Random().ints(1, 46);

		//
		is.distinct().limit(6).sorted().forEach(item -> System.out.println(item));

		// 6개쓸건데 1부터 46
		IntStream is2 = new Random().ints(6,1,46);
		is2.sorted().forEach(item -> System.out.println(item));
	}

}
