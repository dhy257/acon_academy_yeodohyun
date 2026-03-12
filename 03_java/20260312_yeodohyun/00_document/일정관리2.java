package javaprj.day08;

import java.util.Scanner;

public class 일정관리2 { 	
	
	public static void main(String[] args) {
	    Scanner  sc = new Scanner( System.in);
		String[] 일정 = new String[5];
		int index=0;				
		loop: while(true) {
			System.out.println("1.등록  2.조회 3.종료");
			int menu= sc.nextInt();		
			//
			sc.nextLine();			
			switch( menu) {
			case 1:				 
				 index= 등록하기(일정, index, sc);					 
				break;
			case 2:				
				출력하기(일정, index);			
				break;
			case 3:
				 System.out.println("종료합니다");
				break  loop;
				
			}			
		}		
	}  // main	
	
	//등록하기	
	public static  int   등록하기( String[] 일정, int index, Scanner sc ) {
		 System.out.println("일정등록");
		 String  temp = sc.nextLine();
		 일정[index]=temp;
		 index++;	
		 return index;
	}
	
	
	//조회하기
	public static void  출력하기( String[] 일정, int index) {
		 System.out.println("조회한다");
			for( int i=0; i< index; i++) {
				System.out.println( 일정[i]);
			}
	}
}
