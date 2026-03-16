package pro0316;

import java.util.Scanner;

public class AcornStudent_김태준 {
	//속성
		String name;
		int 에너지; 
		int 근육량; 
		int 자바능력; 
		int 프론트능력;
		int 백엔드능력;
		int 배포능력;
		int 키;
		
		Scanner sc = new Scanner(System.in);
		
		//기능(매서드,함수)
		//매서드를 통해서 변수를 사용한다(데이터를 사용하는 기능)
		
		//입력하기(기본)
		//출력하기(기본)
		
		
		public void 입력하기(String name, int 에너지, int 근육량, int 자바능력, int 프론트능력,int 배포능력,int 키) {
			// TODO Auto-generated method stub
			this.name = name;
			this.에너지 = 에너지;
			this.근육량 = 근육량;
			this.자바능력 = 자바능력;
			this.프론트능력 = 프론트능력;
			this.배포능력 = 배포능력;
		
		}
		
		//기능(매서드, 함수)
		  //매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)
		 
		  //입력하기  (기본)  
		  //출력하기  (기본)
		  

		//정보 출력하기
		  public void   정보출력하기(){		  
			 System.out.println("name: " + name);
			 System.out.println("에너지: "+ 에너지);
			 System.out.println("근육량: " + 근육량);
			 System.out.println("자바능력: "+ 자바능력);
			 System.out.println( "프론트능력: "+ 프론트능력); 
			 System.out.println();
		 }


		  public void  배열공부하기(){
		     자바능력  +=20;
		     에너지  -=5;
		        
		  }

		  public  void div로풋터만들기(){
		        프론트능력 +=30;
		        에너지  -=5;
		 } 



		  public void 밥먹기() {
		        에너지 +=100;
		  }
		  

		  public int  웃는다(){
		        에너지 += 10;
		        return 10;
		  }
		  
		  public void 동영상수업수강() {
			  자바능력 += 5;
			  프론트능력 += 5;
			  에너지 -= 5;
		  }
		  
		  public void 배포해보기() {
			  자바능력 += 10;
			  배포능력 += 20;
		  }
		  
		  public void 배포는뭘로() {
			  
			  System.out.println("도커 혹은 클라우드플레어");
		  }
		  
		  
			
}
