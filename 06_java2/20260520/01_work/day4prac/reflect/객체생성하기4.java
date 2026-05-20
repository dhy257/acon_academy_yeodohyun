package day4prac.reflect;

public class 객체생성하기4 {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Class<?> clazz = Class.forName("day4prac.reflect.Member");
		Member m = (Member) clazz.newInstance();
		m.printSquare(10);
	}

}
