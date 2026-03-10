package javaprj.day06;

import java.util.Scanner;

public class 학생등록조회변경삭제6 {

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
				

				//전체 조회 
				for(int i=0; i< index; i++) {
					System.out.println( (i+1)  +  names[i]);
					
				}
				
				//학생번호는 학생index를 활용  (index+1) 
				
				 
				//변경할 학생번호를 입력  :3
				//변경할 이름  :김민정 공주
				System.out.println("변경할 학생번호 입력:");
				int updateNo  = sc.nextInt();
				
				sc.nextLine();  //남아 있는 엔터키 값 제거하기
				
				System.out.println("변경할 이름 입력");
				String newName  = sc.nextLine();		
				names[updateNo-1] =newName; 
				 
				
				//변경이 완료되었다는 메시지 출력
				System.out.println("변경이 완료 ^^");
				
				
				for(int i=0; i< index ; i++) {
					System.out.println( (i+1)  +  names[i]);
					
				} 
				
				
				break;
			case  4:
				
				System.out.println("삭제");
				
				 
				for( int i=0; i< index ; i++) {
					 System.out.println(  (i+1)  +  names[i]);
				}
				
				
				System.out.println("삭제할 번호 선택");
				//삭제할 번호 선택 
				int deleteNo  = sc.nextInt();   // 2
				
				
				//삭제할 인덱스   = 삭제할인덱스  +1
				
				
				for( int i=deleteNo-1  ; i<names.length-1 ; i++) {			
					names[i]  = names[i+1];        		
				}
				
				
				// 삭제할 학생번호 :2
				// 삭제할 인덱스  : 1
				
				//i=1     names[1] = names[2]
				//i=2     names[2] = names[3]
				//i=3     names[3] = names[4]			 
				
				index= index-1;				
				
				System.out.println("삭제후 조회 , 등록한 학생이름만 조회하기");
				for( int i=0; i< index ; i++) {
					System.out.println( names[i]);
				} 
				
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
