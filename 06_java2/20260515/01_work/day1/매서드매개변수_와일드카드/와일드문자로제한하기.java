package day1.매서드매개변수_와일드카드;

import java.util.ArrayList;
 

class Person {
    String name; 
     
    // 생성자 오버로딩
    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Person 상속 Man 클래스
class Man extends Person {
	Man( String name){
	  super(name);
	}
     
}

// Person 상속 Woman 클래스
class Woman extends Person {
	  Woman( String name){
		  super(name);
	  }    
}


//매개변수에서 와일드 문자를 사용하면 좀 더 유연하게 타입을 사용할 수 있다 


public class 와일드문자로제한하기 {

	public static void main(String[] args) {
		 // Person
        ArrayList<Person> listP = new ArrayList<>();
        listP.add(new Person("이사람"));
        listP.add(new Person("김사람"));
        
         

        // Man
        ArrayList<Man> listM = new ArrayList<>();
        listM.add(new Man("공유"));
        listM.add(new Man("스티브잡스"));
       // printData4(listM);
        
        
        

        // Woman
        ArrayList<Woman> listW = new ArrayList<>();
        listW.add(new Woman("아이유"));
        listW.add(new Woman("김연아"));
        
        
        
        //listP 매개변수로 받을 수 있는 매서드를 고르시오
       
       //  printData1(listP);    
       //  printData2(listP);
       //  printData3(listP);        
       //  printData4(listP);       
       //  printData5(listP);    
        
        
        
        //listM 매개변수로 받을 수 있는 매서드를 고르시오       
        
       //  printData1(listM);    
       //  printData2(listM);
       //  printData3(listM);   
       //  printData4(listM);    
       //  printData5(listM);  
        
        
        
        // listW 매개변수로 받을 수 있는 매서드를 고르시오
        // printData1(listW);    
       //  printData2(listW);
        // printData3(listW);   
       //  printData4(listW);     
       //  printData5(listW);  
        
        
        /*
         *        ?   =>  <? extends Object>와  동일한 효과 
			     <?  extends T > : T와 T를 상속받은 클래스를 의미함( T이하  - T상한)   
			     <?  super T >  : T와 T 이상    (T하한)  
         * 
         */
      
      

    }
  

	
   
    public static void printData1(ArrayList<? super Man> list) {    // Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능 
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
    public static void printData2(ArrayList<?>  list) {      // ? extends Object   
            for (Object obj : list) {
                System.out.println(obj);
            }
    } 
    
    
    public static void printData3(ArrayList<? extends Man>  list) {     
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
    
    
    public static void printData4(ArrayList<Man>  list) {
    	
    	 for (Object obj : list) {
             System.out.println(obj);
         } 
    }
     
   

    public static void printData5(ArrayList<? extends Person>  list) {    
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    
    

}
