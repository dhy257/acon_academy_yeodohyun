package day4.reflect;

public class 객체생성하기2 {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		//생성된 객체로 부터 클래스 정보얻어오기
		Member m = new Member();		
		Class clazz  = m.getClass();		
		Member member  =(Member)clazz.newInstance();
		// 자바9버전 이후 생성자 객체를 얻어온후 생성자를 통해서 객체를 생성함
		m.printSquare(2);
		
		 
		
		
		//실습
	    Class clazz2 =m.getClass();
	    Member m2= (Member)clazz2.newInstance();
	    m2.printSquare(3);
		
		
	}

}
