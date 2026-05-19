package day3.stream만나기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class 로또번호스트림으로만들기 {

	public static void main(String[] args) {

		Set<Integer> lottos = new HashSet<>();
		// HashSet<Integer> lottos = new HashSet< >();

		Random r = new Random();

		for (int i = 0; i < 20; i++) {
			lottos.add(r.nextInt(46));
		}

		System.out.println(lottos.size());

		Object[] lottosArray = lottos.toArray();
		Integer[] result = new Integer[6];

		System.arraycopy(lottosArray, 0, result, 0, 6);

		System.out.println("lotto number!!!!");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "  ");
		}

		///////////////////////////////////////////////////
		System.out.println("\n스트림으로 로또번호 6개 출력하기");
		IntStream is = new Random().ints(1, 46);
		System.out.println("\n스트림으로 lotto 생성");
		is.distinct().limit(6).sorted().forEach(number -> System.out.print(number + " "));

		IntStream is2 = new Random().ints(1, 100).limit(10);
		int s = is2.filter(item -> item % 2 == 0).sum();
		System.out.println("\n 합계=" + s);
		//

		// int 스트림 10개 출력하기
		new Random().ints(1, 10).limit(10).forEach(item -> System.out.println(item));

		//
		Random random = new Random();
		random.ints(10, 1, 101).forEach(System.out::println);

	}

}
