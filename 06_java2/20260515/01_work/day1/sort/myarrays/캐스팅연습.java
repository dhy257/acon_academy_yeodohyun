package day1.sort.myarrays;



//형변환

public class 캐스팅연습 {
	
		public static void main(String[] args) {		 
			
			
			//cast 형변환  
			
			Score s =new Score( 100,90); 
			System.out.println( s);			
			
			
			//1. 1번가능?
			Object o = (Score)s;
			//2. 2번 가능?
			MyComparable   m = (MyComparable ) o; 
			
			
		}
		
		
		
		 
}

