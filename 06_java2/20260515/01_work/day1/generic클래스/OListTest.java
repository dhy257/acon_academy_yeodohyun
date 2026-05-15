package day1.generic클래스;

public class OListTest {

	public static void main(String[] args) {
		 
		OList list = new OList();
		list.add(new Score("홍길동",100,90));
		list.add(new Score("김길동",90,90));
		list.add(new Score("이영희",80,90));
		
		
		for( int i=0 ; i<list.size(); i++ ) {			
			System.out.println(  list.get(i));			
			// Object toString   ->  Score toString()
			// 오버라이딩된 매서드는 부모형으로 참조해도 
			// 실제 객체의 매서드가 동작한다 =>다형성
			Object obj = list.get(i);			
			System.out.println(((Score)obj).getKor());			
		}
		
	}

}
