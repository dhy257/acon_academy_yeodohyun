package day21.학생멀티쓰레드.박수경;

public class 멀티스레드예제1 extends Thread{
	@Override
	public void run() {
		int[] musicNum = { 1,2,3,4,5 };
		
		
		
		String []musicList= {
				"BIRDS OF A FEATHER",
				"Ocean Eyes",
				"WILDFLOWER",
				"Happier Than Ever",
				"bury a friend"
		};
		
		
		
		for(int i=0; i<20; i++) {   // 21 
			
			
			try {
				Thread.sleep(1500);
				
				//for( int j =0; j<=4; j++) {     // 5 
					int music = (int)(Math.random()*5);	//0~4
					//System.out.println(music);
					
					
					System.out.println( (i+1) +"번째 노래 : "+musicList[music]);
				
				//}
				
		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
//		for(int i=1; i<=5; i++) {
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(musicNum+"번째 음악인"+music+"을 재생합니다. ");
//		}
	}
}
