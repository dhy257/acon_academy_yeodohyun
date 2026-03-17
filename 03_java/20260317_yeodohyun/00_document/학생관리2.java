package javaprj.day11;

import java.util.Scanner;

public class 학생관리2 {
	
	Student3 [] list = new Student3[5];
	int index=0; 
	Scanner sc = new Scanner(System.in );
	
	
	
	
	//등록하기
	public void 등록하기() {
		
	}
	
	//변경하기
	
	public void   변경하기() {
		
	}
	
	
	//조회하기
	
	public void   조회하기() {
		
	}
	
	//삭제하기
	
	public void  삭제하기() {
		
	}
	
	//실행하기
	 public void run() {  //반복문에서 메뉴제공
		 
	 }
	
	

	public static void main(String[] args) {
		/*
		Student3 [] list = new Student3[5];
		int index=0; 
		Scanner sc = new Scanner(System.in );
		
		
		
		int menu;
		loop:while(true) {
			System.out.println("1.등록 2.조회 3. 변경, 4. 삭제 5. 종료  6. 성적처리");
			menu= sc.nextInt();
			
			sc.nextLine(); //남아 있는 엔터값 지우기 
			switch(menu) {
			
			case 1:
				System.out.println("등록");
				System.out.println("이름, 국어, 영어 입력하세요");
				String tempName  = sc.nextLine();
				int tempKor  = sc.nextInt();
				int tempEng  = sc.nextInt();
				Student3 s = new Student3(tempName,   tempKor,   tempEng);
				list[index]= s;
				index++;				
				break;
			case 2:
				System.out.println("조회");
				for( int i=0; i<index; i++) {
					System.out.println( list[i].toString());
				}
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("종료");
				break loop;
			case 6:
				for( int i=0; i< index; i++) {
					list[i].calcGrade();
				}
				break;
			default:
				System.out.println("메뉴x");				
			}
			
		}
		*/

	}

}
