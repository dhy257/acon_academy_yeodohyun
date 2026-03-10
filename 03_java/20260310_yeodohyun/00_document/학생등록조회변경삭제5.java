package javaprj.day06;

import java.util.Scanner;

public class 학생등록조회변경삭제5 {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner( System.in) ;
		
		String[] names= new String[5];
		int index=0;
		
		
		int menu=1;  //1.등록  2.조회  3.변경  4.삭제 5.종료
		/*
		 loop: while(true){
		  
		  
		  }
		 */
		
		loop:while(true) {
			System.out.println("1.등록  2.조회  3.변경  4.삭제 5.종료");
			menu= sc.nextInt();
			
			sc.nextLine(); // 남아 있는 엔터값 지우기 		
			
			switch(menu) {
			case 1:
				System.out.println("등록 :이름 입력하세요");
				String name  = sc.nextLine();
				names[index]=name;
				index++;
				System.out.println("등록 되었습니다");
				
				break;
			case 2:
				System.out.println("조회");				
				for( int i=0; i<index; i++) {
					System.out.println( (i+1) +  names[i]);
				}				
				break;
				
				
			case  3:
				System.out.println("변경");				
				
				break;
			case  4:
				
				System.out.println("삭제");
				
				
				break;
			case 5:
				System.out.println("종료");	
				break loop;
			default:
				System.out.println("없다");	
			}
		}

	}

}
