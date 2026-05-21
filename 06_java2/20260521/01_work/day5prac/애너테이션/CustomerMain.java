package day5prac.애너테이션;

import java.lang.reflect.Field;

public class CustomerMain {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Customer c = new Customer("010-1234-5678910");
		검증하기(c);
	}

	private static void 검증하기(Customer c)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		// ? extends Object 랑 <?> 랑 같은거임
		Class<?> clazz = c.getClass();
//		Field[] fields = clazz.getDeclaredFields();
//		
//		for(Field field : fields) {
//			System.out.println(field);
//		}
		Field field = clazz.getDeclaredField("tel");

		// 필드의 실제값
		String value = (String) field.get(c);
		System.out.println(value);
		// 애너테이션에 설정된 값 ( 지금은 14 - Customer 클래스에서 설정함 )
		MaxLen annotation = field.getAnnotation(MaxLen.class);
		if (annotation != null) {
			int 애너테이션값 = annotation.length();
			// 비교하기
			if (value.length() > 애너테이션값) {
//				System.out.println(애너테이션값+" 이내여야 한다.");
				throw new RuntimeException(애너테이션값 + " 이내여야 한다.");
			}
		}
	}

}
