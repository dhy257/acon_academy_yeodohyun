package day4prac.reflect;

public class 객체생성하기2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		// 1. 클래스정보 얻어오기, 클래스 정보를 가지고 객체생성하기
		// <?> == ? extends Object
//		Class<?> clazz = Member.class;

		Class clazz = Member.class;
		Member member = (Member) clazz.newInstance();
		member.printSquare(3);

	}

}
