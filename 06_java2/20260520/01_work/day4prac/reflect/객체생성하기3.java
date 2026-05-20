package day4prac.reflect;

public class 객체생성하기3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		// 생성된 객체로부터 클래스 정보 얻어오기
		Member m = new Member();

		Class clazz = m.getClass();
		Member m2 = (Member) clazz.newInstance();
		m2.printSquare(3);
	}

}
