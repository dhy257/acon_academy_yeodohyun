package day02.prec.복습;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//##############################
//오후 실습과제
//############################## 
//Runnable
//Consumer<T>
//Supplier<T>
//Predicate<T>
//Function<T,R>
//
//1. Runnable  :      버킷리스트 출력하기 
//2. Consumer  :     3만원으로 장보기  
//3. Supplier  :       요리만들기   (레시피 정보 출력하고  반환값은  요리명을 반환해 주세요 !)
//
//4. Predicate  :      입력으로 받은 요리가 내가만든요리인 경우 true, false반환하기
//
//5. Function  :       입력하나 반환있는 함수 만들기  ( 2개 이상만 작성하기)
//
//                       - 입력으로 들어오는 수의 제곱  반환하기
//                       - 입력으로 들어오는 수의 범위안의 난수 반환하기
//                       - 입력으로 들어오는 금액에 대한 화폐매수 구하기
//
// #####################################################
 


public class day2Test {

	public static void main(String[] args) {
		class A implements Runnable{
			@Override
			public void run() {
				System.out.println("메가주 장바구니 채우기");
				System.out.println("유토페티아");
				
			}

			
		}
		A a=new A();
		a.run();
		
		
		//map => 품목, 가격  (장바구니 )
		//소비 
		
		class Market    implements Consumer<  Map<String , Integer>>{

			@Override
			public void accept(Map<String, Integer> t) {
				
				//
				int 돈=  30000;				
				//장바구니 목록 물품 구매하기 
				
				 
				
				for(  Map.Entry<String, Integer>   entry :   t.entrySet() ) {
					System.out.println(  entry.getKey()  +"소비");					
					돈  -= entry.getValue();
				}
				
				
				
				System.out.println(돈);
					 
			} 
			
		}
		
		
		 Map<String, Integer> map = new HashMap<>();
		 Consumer<  Map<String , Integer>>   mm =   new Market();
		 map.put("orange", 3000);
	     map.put("apple", 1000);
	     map.put("banana", 2000);

	     mm.accept(map); // Market.accept()가 실행됨
		 
		
		
	     
	    Supplier<String> sss= () -> { 
	    	
	    	///레시피 출력
	    	///
	    	///
	    	///
	    	///
	    	
	    	return "김치볶음밥" ;};
	    
	    
	     
	     
	     
	    String food  = sss.get();
		

		
		//4. Predicate  :      입력으로 받은 요리가 내가만든요리인 경우 true, false반환하기
		class C  implements Predicate<String>{
	
			@Override
			public boolean test(String a) {
				// TODO Auto-generated method stub
				return a.equals("김치볶음밥");
			}
			
		}
		
		C c=new C();
		System.out.println(c.test(food));
		System.out.println(c.test("test"));
		System.out.println(c.test("test"));
		//입력으로 들어오는 수의 제곱  반환하기
		Function<Integer, Integer> square = x -> x * x;
		//입력으로 들어오는 수의 제곱  반환하기
		System.out.println(square.apply(3));  // 9
		//입력으로 들어오는 수의 범위안의 난수 반환하기
		Function<Integer, Integer> rendom = (x) ->{
			Random random = new Random();
			return random.nextInt(x);
		};
		System.out.println(rendom.apply(3));  // 9
		//입력으로 들어오는 금액에 대한 화폐매수 구하기
		Function<Integer, int[]> mon = (x) ->{
			int[]  mon2= { 50000,10000,5000,1000,500,100,50,10,5,1};  //화퍠단위별 매수 
			int[] arr = new int[mon2.length];
			for (int i = 0; i < mon2.length; i++) {
				System.out.println(mon2[i]);
				arr[i]=x/mon2[i];
				x-=(mon2[i]*arr[i]);
			}
			
			
			return arr;
			 
		};
		
		
		
		int[] arreault  = mon.apply(38000);
		
		System.out.println( Arrays.toString(arreault) );
	}
}
