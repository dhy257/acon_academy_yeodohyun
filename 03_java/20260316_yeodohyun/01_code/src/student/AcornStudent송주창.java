package javaprj.day10;

//에이콘학생정보를 저장하기 위한 자료형 만들기
//캡슐화
//데이터 + 매서드(함수)묶음
//메서드가 하는 역할이 데이터를 사용한다(데이터 변경하거나, 단순히 읽기
public class AcornStudent송주창 {
	
	//속성
	  String name;
	  int muscle;
	  int hunger;	
	  int weight;
	  int coding;	
	  int fatigue;	//피로도
	
	   
	  //기능(매서드, 함수)
	  //매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)
	 
	  //입력하기  (기본)  
	  //출력하기  (기본)
	  
	  
	  //배열공부하기

	  public void  myinfo( String name, int muscle, int hunger , int weight, int coding, int fatigue){
	           this.name  = name;
	           this.muscle = muscle;
	           this.hunger = hunger;
	           this.weight = weight;
	           this.coding = coding;
	           this.fatigue = fatigue;
	           
	  }

	//정보 출력하기
	  public void   print(){		  
		 System.out.println("이름 : " + name);
		 System.out.println("골격근량 : "+ muscle);
		 System.out.println("허기 : " + hunger);
		 System.out.println("코딩능력 : "+ coding);
		 System.out.println( "피로도 : "+ fatigue); 
		 System.out.println("======================");
	 }


	  public void  study(){
	     coding += 20;
	     fatigue -= 10;
	  }

	  public  void exercise(){
	        muscle += 5;
	        fatigue -= 15;
	 } 



	  public void food() {
		  hunger -= 10;
		  weight += 2;
	  }
	  

	  public void sleep() {
		  fatigue -= 10;
	  }
}
