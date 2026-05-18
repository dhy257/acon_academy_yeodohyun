package day2.lambda.predicate;

import java.util.function.Predicate;

@FunctionalInterface
interface MyPredicate<T> {
    boolean test(T t); // 입력이 있고 반환은  boolean 이다
}

public class Ex01 {

	
	public static void main(String[] args) {
		 
		
		
		
		class MyPredicateImp  implements MyPredicate<String>{

			@Override
			public boolean test(String t) {
			           
				return t.startsWith("쌀");
			}
			
		}
		//1.
		 MyPredicate< String >  a = new  MyPredicateImp();
		 boolean result  =a.test("쌀국수");
		 System.out.println( result);
		 
		
		 boolean result2  =a.test("쌀피자");
		 System.out.println( result2);
		 
		
		
		//2.
		 MyPredicate< String >  b = new  MyPredicate<String>() {

			@Override
			public boolean test(String t) {
				 
				return t.startsWith("쌀");
			}};
		

			
		 boolean result3 =b.test("쌀호떡");
		 System.out.println( result3);
		 
		 
		 
		 
		 
		 
		 
		 //3.
		 MyPredicate< String >  c =  (t) ->  t.startsWith("쌀");		 
		 
		 boolean result4= c.test("쌀만두");
		 System.out.println(result4);
		 
		 
		 
		 
		 
		 //4.		 
		 Predicate<Integer>  d=  t ->  t%2==0 ;
		 
		 
		 boolean result5 =d.test(4);
		 System.out.println( result5);
		 
		 
		 
		 
		 
		 
		 
	}

}
