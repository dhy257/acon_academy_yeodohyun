package day2.lambda.function;

import java.util.Arrays;
import java.util.function.Function;

//입력  -> 반환
interface MyFunction<T,R>{
	R  apply( T  t);
}


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 		
		class MyFunctionImp implements MyFunction<Integer , Integer>{

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*t;
			}			
		}	
		
		
		
		 MyFunction<Integer, Integer>  a= new   MyFunctionImp();
		 int result  =a.apply(5);
		 System.out.println( result);
		 
		 
		 
		 
		 //2. 		 
		 MyFunction<Integer, Integer>  b =  new MyFunction<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*3;
			}};
		 
		 			
			
		int result2  = b.apply(3);			
		System.out.println( result2);
			
			
		 
		
		//3. 람다		
		MyFunction<Integer, Integer> c = (t)-> t*4;			
		int result3  = c.apply(2);		
		System.out.println( result3);
		
		
		
		
		//
		Function<Integer, int[]>     d =  t  ->  new int[] {1,3,6,t} ;
		
		Function<Integer, int[]>    e =  t  -> {			
			int[] arr= {2,4,6 ,t};
			return arr; 
	    }; 
	   
	    
	    int[] result4  = d.apply(4);
	    int[] result5  = e.apply(3);
	    
	    
	    System.out.println(  Arrays.toString( result4));
	    System.out.println(  Arrays.toString( result5));
	    
	    
	   
	}

}
