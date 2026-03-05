

import java.util.Scanner;

public class 수구하기 {

	public static void main(String[] args) {
		
		
		//
		
		/*
		  
		     1. 출력자료 : 양수개수: pos_cnt, 음수 개수: neg_cnt, 양수중짝수 개수 : even_cnt, 
			    양수중 홀수 개수 : odd_cnt
			 2. 입력자료 : 입력되는 수 : number
		  	 3. 처리자료 : 반복제어변수: N
			 4. Symbolic constant(S.C) : MAX =100			 
			 
			 
			 1. MAX만큼 반복
				 1.1 수 입력
				 1,2 수 판단 
				 1.2.1 양수이면 
				    -양수 개수 증가
				    -홀수 짝수 개수 구하기 
				 1.2.2. 음수이면 
				    -음수 개수 증가
		    2. 양수개수, 음수개수 , 양수 중 짝수개수, 양수 중 음수개수 출력 
		 */
		 int  pos_cnt=0 ,neg_cnt=0,  even_cnt=0,  odd_cnt=0;  //출력
		 int  number;  //입력
	  	 //3. 처리자료 : 반복제어변수:  i
		 //4. Symbolic constant(S.C) : MAX =100
		 final int MAX=5;
		
		 
		 
		 Scanner sc = new Scanner( System.in);
		 
		 
		 for( int i=1; i<=MAX ; i++) {
			  //System.out.println("안녕");
			 System.out.print("숫자입력");
			 number  = sc.nextInt();
			 
			 if( number >0) {
				 //양수
				 pos_cnt++;   // pos_cnt=pos_cnt +1;
				 
				 if( number %2  ==0) {
					 
					 //짝수
					 even_cnt++;
					 
				 }else {
					 //홀수
					 odd_cnt++;
				 }				 
				 
			 }else {				 
				 //음수
				 neg_cnt++;  
			 }
		 } 
		 
		 
		 //2.  		 
		 System.out.println( "양수의 개수=" + pos_cnt );
		 System.out.println( "음수의 개수="+ neg_cnt );
		 System.out.println( "양수중 짝수의 개수 "+ even_cnt );
		 System.out.println( "양수중 홀수의 개수"+ odd_cnt );
		 
	}  //main

}//class
