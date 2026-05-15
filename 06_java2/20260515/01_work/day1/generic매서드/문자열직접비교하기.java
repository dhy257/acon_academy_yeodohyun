package day1.generic매서드;

public class 문자열직접비교하기 {

	public static void main(String[] args) {
		 
		char[] fruit = { 'o','r','a', 'n','g','e'};
		char[] fruit2 = { 'o','r','a', 'k','g','e'};
		
		// 두 개의 문자열이 같은가?
			
		
		boolean r=true;		
		boolean result  = fruit.length == fruit2.length;  		
		
		if( !result ) r=false;
		if(  result ) {			
			for( int i=0; i< fruit.length; i++) {			
				if( fruit[i]  !=fruit2[i]) {
				   r=false;
				   break ;
				}			
			} 
		}
		//
		
		 
		System.out.println( r);
		
		/*
		  
		  boolean same = true;

		// 길이 비교
		if (fruit.length != fruit2.length) {
		    same = false;
		} else {
		    // 내용 비교
		    for (int i = 0; i < fruit.length; i++) {
		        if (fruit[i] != fruit2[i]) {
		            same = false;
		            break;
		        }
		    }
		}
		
		System.out.println("두 배열 동일 여부: " + same);
		 */
		
		
	}
	
	
	
	

}
