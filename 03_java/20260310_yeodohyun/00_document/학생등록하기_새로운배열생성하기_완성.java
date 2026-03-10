package day06;

import java.util.Scanner;

public class 학생등록하기_새로운배열생성하기_완성 {

	public static void main(String[] args) {
		
		
		//배열특징
		//1.같은 자료형이어야 한다 
		//2.반드시 크기를 알아야 한다  (크기를 정해야 한다)
		//3.더 큰 배열이 필요하다면  새로운 배열을 만들고 새로운 배열로 모두 옮겨야 한다 
		
		
		final int MAX=5;  // 현재배열의 전체 크기
		int capacity= MAX;
		
		
		String[]  names = new String[5];
		Scanner sc = new Scanner( System.in);
		int index=0;  //현재배열의 size(등록한 크기) 
		
		
		
		// index
		//  0   1   2   3   4
		// index  5
		// =>배열의 크기가 부족함 사이즈늘 늘려야 함 
		// =>해결 ( 더 큰 배열만든다. 요소를 복사한다. )
		
		//크기 체크 
		 
		
		
		//크기판단 
		//새로운배열 생성
		
		
		 
	loop:	while( true) {
			
		  System.out.println( "메뉴 1.등록 2.조회 3.종료");
		  int menu = sc.nextInt();
		  
		  switch( menu) {
		  case 1:
			  if( index >=  capacity ) {  //5  >= 5
					//새로운 더 큰 배열 생성 
					 
					capacity  = capacity+5;
					String[] newNames  = new String[ capacity ];  // 
					
					//기존배열요소 복사  
					for(int i=0; i< names.length ; i++) {
						newNames[i] = names[i];
					}			
					
					//새로운배열을 참조하게 함 
					names  = newNames;	  
					System.out.println( "새로운 배열이 만들어졌다"); 
					
				} 
			  			   
				 
				System.out.println( "이름을 등록");
				String name  = sc.next();
				names[index] = name;
				index++;
			 	
				
				//
				
			 break;
			 
			 
		  case 2:
			  System.out.println("조회");
			  for( int i=0; i< index; i++) {
				  System.out.println( names[i]);
			  }
			  
			  break;
		  case 3:
			  System.out.println("종료");
			  break loop;
			  
		  }
			
		}
		
		
		
		
		
	 
		
		
		

	}

}
