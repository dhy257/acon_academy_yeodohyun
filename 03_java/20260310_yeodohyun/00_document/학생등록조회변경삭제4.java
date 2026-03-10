package javaprj.day06;

import java.util.Scanner;

public class 학생등록조회변경삭제4 {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner( System.in) ;
		
		int menu=1;  //1.등록  2.조회  3.변경  4.삭제 5.종료
		
		menu= sc.nextInt();
		
		sc.nextLine(); // 남아 있는 엔터값 지우기 		
		
		switch(menu) {
		case 1:
			System.out.println("등록");
			break;
		case 2:
			System.out.println("조회");
			break;
		case  3:
			System.out.println("변경");
			break;
		case  4:
			
			System.out.println("삭제");
			break;
		case 5:
			System.out.println("종료");			
			
		}

	}

}
