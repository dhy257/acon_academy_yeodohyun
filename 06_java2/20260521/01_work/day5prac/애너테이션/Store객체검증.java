package day5prac.애너테이션;

import java.lang.reflect.Field;

public class Store객체검증 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		Store s = new Store(10, 3, 5);
		검증하기(s);
	}

	private static void 검증하기(Store s) throws IllegalArgumentException, IllegalAccessException {

		// s객체의 클래스정보를 얻어오기
		// 필드정보 얻어오기
		// 필드의 애너테이션 정보 얻어오기
		// 실제값과 애너테이션의 값을 비교

		Class<?> clazz = s.getClass();
		Field[] fields = clazz.getDeclaredFields();

		for (Field field : fields) {

			System.out.println("field" + field);
			Count annotation = field.getAnnotation(Count.class);

			if (annotation != null) {

				// private 접근자 필드도 접근할 수 잇음
				field.setAccessible(true);
				int value = (int) field.get(s);
				System.out.println(value + "실제값");

				// 필드에 붙어 잇는 애너테이션 값 얻어오기
				int countValue = annotation.value();

				// 두 값을 비교
				if (value != countValue) {

					System.out.println("다르다");
					// throw new IllegalArgumentException( field.getName() +"항목은 " + countValue +"와
					// 같아야 한다 !!");
				} else {
					System.out.println("성공");
				}

			}
		}

	}

}