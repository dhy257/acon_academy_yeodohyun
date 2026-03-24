package prac.exception.unchecked;

public class 업캐스팅테스트하기 {

	public static void main(String[] args) {


		Object o  = new ArrayIndexOutOfBoundsException();
		Exception o2  = new ArrayIndexOutOfBoundsException("배열의 범위를 벗어남");
		 
		
		System.out.println( o); //getMessage()는 없다   업캐스팅 되어서 자식의 고유매서드를 사용할 수 없다
		System.out.println( o2.getMessage());
		
		
		
	}

}
