package day1.generic매서드;


public class GenericMethodExample {    
   // 제네릭 메서드 정의. T는 타입 파라미터로 호출 시 결정됨
	
   public static <T> void  print(T  value) {      
       System.out.println(value );
   }
   
   
   
   public static void main(String[] args) {
      
    
       GenericMethodExample.<Integer>print(5);
       GenericMethodExample.<String>print("hello 제네릭매서드 ");
       
       
       // 제네릭 메서드 호출 시 타입을 명시하지 않아도 자동으로 추론됨
       GenericMethodExample.print(11);
       GenericMethodExample.print("hello 제네릭매서드 ^^");
       
   }
}