package hello;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {     // main   프로그램 시작
		 
	/*
	 * 
	 * >>  자료명세 (데이터-변수 찾기)
		입력: 사용자가 입력하는 가위바위보 : user   => 0 (가위)  1(바위) 2 (보)
		출력: 사용자승패:result
		처리:    컴퓨터가 임의로 만들어 낸 
		       가위바위보 정보 : computer
		준비: 문제에서 미리 제공되는 데이터 x
		의미화상수 :  변하지 않을 값  x
		
		
	
	
	  >>  처리과정
		1. 반복( 무승부일동안 )
		    1.1 사용자 가위바위보 입력
		    1.2 컴퓨터 임의로 가위바위보 생성
		
		2. 사용자의 값에 따른 승부구하기 
		    - 사용자가 가위인경우 컴퓨터가 보 이면 사용자 승리
		    - 사용자가 바위인경우 컴퓨터가 가위 이면 사용자 승리 
		    - 사용자가 보인경우   컴퓨토가 바위 이면 사용자 승리
		3. 승부 출력 
		
		
		
	  >> 순서도 작성 	
		
		
	 */ 
		
	 String userName="";
	 
	 int user ;
	 String result="";
	 int computer;
	 
	 
	 Scanner  sc = new Scanner( System.in);
	 //사용자와 컴퓨터 가위바위보 하기
	 
	 
	 System.out.println("사용자 이름을 입력하세요");
	 userName = sc.nextLine();
	 
	 
	 //1. 반복
	 while( true) {
		 
		 //
		 System.out.println("  사용자 가위(0) 바위(1) 보(2) 입력:  ");
		 user  = sc.nextInt(); //0   1   2
		 computer   =   (int) ( Math.random() *3);
		 
		 if( user!=computer) break;   // 같지않으면 반복문 종료하기 
		 
	 }
		
	 
	 
	 //2.사용자 승패 구하기
	 
	 //사용자가  가위일때
	 if( user ==0) {
		 if( computer ==2) {
			 result="사용자 승";
		 }else {
			 result="사용자 패";
		 }
	 }else if( user  ==1) {
		 if( computer ==0) {
			 result="사용자 승";
		 }else {
			 result="사용자 패";
		 }
		 
	 }else if( user==2) {
		 if( computer  ==1) {
			 result="사용자 승";
		 }else {
			 result="사용자 패";
		 }
	 }
	  
	 
	 // 3. 승패출력하기	 
	 System.out.println( userName +"님  사용자 결과==>"  + result);
	 System.out.println( "사용자==>"  + user);
	 System.out.println( "컴퓨터=>"  + computer); 


	} // 종료하기

}
