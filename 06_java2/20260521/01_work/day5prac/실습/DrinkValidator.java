package day5prac.실습;

import java.lang.reflect.Field;

public class DrinkValidator {

	public static void validate(Drink drink) throws Exception {

		Field field = Drink.class.getDeclaredField("sugar");

		field.setAccessible(true);

		MaxSugar maxSugar = field.getAnnotation(MaxSugar.class);

		int max = maxSugar.value();

		int currentSugar = (int) field.get(drink);

		System.out.println("현재 당분 : " + currentSugar);
		System.out.println("허용 당분 : " + max);

		if (currentSugar > max) {

			System.out.println("당분 과다");

		} else {

			System.out.println("적정 당분");

		}
	}
}