package javaprj.day04;

public class 고지연매운맛1 {

	public static void main(String[] args) {
		 
		
		// 1999년
		// k시인구 :  1800000 
		// h시인구 :  2500000

		//k시의 인구가 h시 인구 보다 많아지는 해는?
		
		//출력
		int result;
		
		
		//처리
		
		//준비
	     int year=1999;
	     double  rise_k=1800000;    //
	     double  rise_h=2500000;    //
	     
	     
	     
	     while(rise_k  <= rise_h ) {
	    	 
	    	 year= year+1; // year++;
	    	 
	    	 rise_k = rise_k *(1+0.042);  // rise_k * 1.042   
	    	 rise_h = rise_h *(1+0.032);  // rise_h * 1.032
	    	 
	    	 // 	   rise_k =  rise_k  +  (  rise_k *  0.042) ;  	 
	    	 //        rise_h =  rise_h  +  (  rise_h *  0.032) ; 	
	    	 
	    	 System.out.println(rise_k);
	    	 System.out.println(rise_h);
	    	 System.out.println(year);
	    	 
	    	 
	     }	     
	     
	     result  = year;	     
	     System.out.println( result ); 
		
		
		
		
	}

}
