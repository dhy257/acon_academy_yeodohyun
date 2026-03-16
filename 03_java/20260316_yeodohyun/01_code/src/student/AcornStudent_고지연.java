package javaprj.day10;


//AcornStudent s  = new AcornStudent();   //  변수만들기 , 객체생성기



//에이콘학생정보를 저장하기 위한  자료형 만들기 
//캡슐화 
//데이타+ 매서드(함수) 묶음
//매서드가 하는 역할이 데이터를 사용한다 ( 데이터변경하거나, 단순히 읽기)
public class AcornStudent_고지연 {


  //속성
  String name;
  private int 에너지;
  private int 자바능력;
  private int 프론트능력;
  private int 휴식시간;
  

   
  //기능(매서드, 함수)
  //매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)
	 
  //입력하기  (기본)  
  //출력하기  (기본)
  
  
  //배열공부하기

  public void  입력하기( String name, int 에너지, int 자바능력, int 프론트능력, int 휴식시간){
           this.name  = name;
           this.에너지 = 에너지;
           this.자바능력 =  자바능력;
           this.프론트능력  = 프론트능력;
           this.휴식시간 = 휴식시간;
           
  }

//정보 출력하기
  public void   정보출력하기(){		  
     System.out.println( "***************");
	 System.out.println("name" + name);
	 System.out.println("에너지"+ 에너지);	 
	 System.out.println("자바능력"+ 자바능력);
	 System.out.println( "프론트능력"+ 프론트능력);
	 System.out.println("휴식시간" + 휴식시간);
	 System.out.println( "***************"); 
 }


  public void  배열공부하기(){
     자바능력  +=20;
     에너지  -=5;
     휴식시간  -=10;
        
  }

  public  void div로풋터만들기(){
        프론트능력 +=30;
        에너지  -=5;
        휴식시간  -=10;
 }
  
  public  void 복습하기(){
	  자바능력  +=10;
      프론트능력 +=10;
      에너지  -=5;
      휴식시간  -=5;
}

  public void 밥먹기() {
        에너지 +=100;
  }  

  
  
}
