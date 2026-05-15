package day1.sort;

public class 문자열비교하기 {
	
	public static void main(String[] args) {
		
		
		
		String str="banana";   //기준
		String str2="apple";  //비교
		
		 
		
		// equals()  => 같니?  true, false
		if( str.equals(str2)) {
			System.out.println(" 두 문자열은 같아요");
		}
		
		
		//String클래스는   Comparable을 구현한 클래스이다
		// compareTo() = >   크면(사전상 뒤) 양수, 작으면( 사전상 앞) 음수, 같으면 0 		
		int rtn  =str.compareTo(str2);		
		if( rtn > 0) {
			System.out.println( " str이 str2보다 사전상 뒤에 위치함");
		}
		
		
	}

}
