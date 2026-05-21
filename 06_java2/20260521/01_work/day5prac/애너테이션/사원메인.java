package day5prac.애너테이션;

import java.lang.reflect.Field;
import java.util.Arrays;

public class 사원메인 {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		사원 a = new 사원("사원1", "Monday");
		검증하기(a);

//		사원 b = new 사원("사원2", "Tuesday");
//		검증하기(b);
	}

	private static void 검증하기(사원 a)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class clazz = a.getClass();
		Field nameField = clazz.getDeclaredField("name");
		Field 쉬는요일Field = clazz.getDeclaredField("쉬는요일");

		// 필드의 실제값 얻어오기
		String value = (String) 쉬는요일Field.get(a);
		System.out.println(value);

		// 애너테이션 값 얻어오기, 배열이 얻어진다
		WeekDaysAvail annotation = 쉬는요일Field.getAnnotation(WeekDaysAvail.class);

		if (annotation != null) {
			// 애너테이션 값 가져오기
			String[] 애너테이션값 = annotation.value();
			Arrays.stream(애너테이션값).forEach(item -> System.out.println(item));

			// 애너테이션 값 중에 쉴 수 있는 요일 있는지 확인하기
			boolean f = false;
			for (String day : 애너테이션값) {
				if (value.equals(day)) {
					f = true;
					break;
				}
			}
			if (f) {
				System.out.println("쉴 수 있다");
			} else {
				System.out.println("쉴 수 없다." + value);
			}
		}
	}
}
