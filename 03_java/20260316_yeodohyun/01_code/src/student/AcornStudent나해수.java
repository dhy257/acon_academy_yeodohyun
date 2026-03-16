package javaprj_day10;


//  AcornStudent s  = new AcornStudent();   //  변수만들기 , 객체생성기



// 에이콘학생정보를 저장하기 위한  자료형 만들기 
//캡슐화 
//데이타+ 매서드(함수) 묶음
//매서드가 하는 역할이 데이터를 사용한다 ( 데이터변경하거나, 단순히 읽기)
public class AcornStudent나해수 {

	
	  //속성
	  private String name;
	  private int 체력;
	  private int 자바능력;
	  private int 기분좋음;
	  private int 기분안좋음;	  
	  
	
	   
	  //기능(매서드, 함수)
	  //매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)
 	 
	  //입력하기  (기본)  
	  //출력하기  (기본)
	  
	  
	  //배열공부하기

	  public void  입력하기( String name, int 체력, int 자바능력, int 기분좋음, int 기분안좋음){
	           this.name  = name;
	           this.체력 = 체력;
	           this.자바능력 =  자바능력;
	           this.기분좋음 = 기분좋음;
	           this.기분안좋음 =  기분안좋음;
	           
	           
	           
	  }

	//정보 출력하기
	  public void   정보출력하기(){		  
		 System.out.println("--------------");
		 System.out.println("name " + name);
		 System.out.println("체력 "+ 체력);
		 System.out.println("자바능력 "+ 자바능력);
		 System.out.println("기분좋음 " + 기분좋음);
		 System.out.println("기분안좋음 "+ 기분안좋음);
		 System.out.println();
		 
		 
	 }


	  public void  아침에일어나기(){
		  System.out.println("///////////");
		  System.out.println("아침에 일어나면");
		     기분안좋음  +=20;
		     체력  -=20;
	  }
	  
	  public void  학원가기(){
		  System.out.println("///////////");
		  System.out.println("학원에 가면");
		     체력  -=20;
	  }
	  
	  
	  public void  자바공부하기(){
		  System.out.println("///////////");
		  System.out.println("자바공부를 하면");
		  	자바능력  +=20;
		  	기분좋음  +=5;
		  	체력  -=30;
	        
	  }
	  
	  public int  디저트먹기(){
		  System.out.println("///////////");
		  System.out.println("디저트를 먹으면");
	        체력 += 10;
	        기분좋음 += 10;
	        기분안좋음  +=-10;
	        return 10;
	  }

	  
	  public void 밥먹기() {
		  System.out.println("///////////");
		  System.out.println("밥을 먹으면");
	        체력 +=50;
	        기분안좋음  +=-5;
	        
	  }

	  public  void 집가기(){
		  System.out.println("///////////");
		  System.out.println("집에 가면");
	        기분좋음 +=50;
	        기분안좋음  -=5;
	        체력  -=10;
	      
	 } 

	  
	  
}
