package day2.lambda;

import java.util.ArrayList;

interface MyRunnable{
	void run();
}



// MYRunnable 인터페이스 람다식으로 구현하기
public class MyRunnable구현하기 {

	public static void main(String[] args) {
	 
	 
		MyRunnable  r0 = new MyRunnable(){

			@Override
			public void run() {
				   System.out.println(" run~~~~"); 
				
			}};
		
	    r0.run();		
		
		
		MyRunnable  r =  () ->{			
			System.out.println("run !!!! lamda");		
			
		};				
		r.run();
		
		//수행할 코드가 한 줄인경우  {   } 중괄호 블럭 생략할 수 있다.
		MyRunnable r1 = () -> System.out.println("hi");
		r1.run();
		
		 
		
		
		 MyRunnable r2 = () ->{			
			
			System.out.println("<<에이콘 학생명단입니다 화이팅^^ >>");
			String[] names= {"최하은"  ,"황예지"  ,"김보성"   ,"최지태"  ,"정연수"  , "이동우" ,"박시우" ,"오윤석"  ,"권지언","윤현기","임형택","박예린","이정호", "김민환" ,"김유민" , "박수경" ,"이수민" };
			 
			
			System.out.println( names.length);
			for( String name : names) {
				System.out.println( name);
			} 
		};
		
		
		
		r2.run();
		 
			

	}

}
