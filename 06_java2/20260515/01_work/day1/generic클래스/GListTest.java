package day1.generic클래스;

public class GListTest {

	public static void main(String[] args) {
	 
		GList<Score> list = new GList<>();
		
		list.add( new Score("홍길동" , 100 ,99));
		list.add( new Score("김길동", 99,100));
		
		
		for( int i=0 ; i< list.size() ; i++) {
			Score s  =list.get(i);
			System.out.println(s);
			System.out.println( s.getEng());
			
		}
		

	}

}
