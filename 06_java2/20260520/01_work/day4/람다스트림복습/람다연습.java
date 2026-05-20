package day4.람다스트림복습;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 람다연습 {

	public static void main(String[] args) {
		 
		//   () ->{}
		
		
		//입력:x, 반환: x
		
		Runnable r =()->{
			
			System.out.println(" 오늘은 목요일  곧 금요일이당 !! ^");
		};
		
		
		
		r.run();
		
		
	 
		//입력:x, 반환 :o
		Supplier<Integer> s  = ()->{
			
			return 2000000000;
		};
		
		
		
		int rtn  =s.get();
	    System.out.println( rtn);
	    
	    
	   
	    
	    //Consumer  : 소비하다 	  
	    
	    //입력:o, 반환: x
	    Consumer< Integer> c = ( amt )->{
	    	
	    	System.out.print("소비 시작");
	    	System.out.print("샤넬백");
	    	amt -= 10000000;
	    	System.out.print(amt);
	    };
	
	    
	    c.accept(  s.get());
	    //c.accept(2000000000);
		
		//판별
	    //입력:o , 반환: boolean
	    Predicate<Integer>  p = ( num)->{	    	
	    	 return  num%2==0?true:false;
	    };
		
	    
	   boolean result = p.test(10);
	   
	   if( p.test(10)) {
		   System.out.println("짝수군요");
	   }
	   
	   // 입력:o, 반환:o   
	   Function<Integer, int[]>  f= (  su)->{
		   
		   int[] arr= {1,8,5,6,8,7};
		   return arr;
	   };
		
	   
	   int[] result2=f.apply(10);
	   
	   System.out.print( Arrays.toString(result2));
	   
	}

}
