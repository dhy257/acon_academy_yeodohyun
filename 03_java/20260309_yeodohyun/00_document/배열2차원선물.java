 package javaprj.day05;

import java.util.Scanner;

public class 배열2차원선물{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[][] gift= {			
				
				{"", "","", "커피",""},
				{"", "","","",""},
				{"", "","","" ,"커피"},
				{"", "커피","","" ,""},
				 
		};
		
		
		 
		
	    Scanner sc  = new Scanner(System.in);
	    System.out.println("4행 5열의 문자열배열이 준비되어 있습니다. 3군데에 커피가 있어요 ^^");
		System.out.println("행과 열을 입력해 주세요. 커피가 들어 있을 만한 행과열 입력 "
				+ " 예시 행 열) 0 0 ");
		
                
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		if( gift[row][col].equals("커피")) {
			System.out.println("커피 드려요 ^^  ~~~~~");
		}else {
			System.out.println("그곳은 커피가 없어요 ㅠㅠ");
		}
		
		
		

	}

}
