package day2.lambda.runnable;

import java.util.ArrayList;

public class Runnable활용예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//당신의 코드를 실행해 드립니다 
		
		
		ArrayList<Runnable> doList  = new ArrayList<>();
		
		doList.add( new Runnable() {

			@Override
			public void run() {
				System.out.println(" 주연이는 2단 출력");
				for( int i=1; i<=9; i++) {
					System.out.println(2*i);
				}				
			}});
		 
		
		doList.add( new 안성재());
		doList.add(new 김연아());
		
		
		
		for( Runnable r :  doList) {
			r.run();
		}
		
	}

}
