package day2.lambda.supplier;

import java.util.function.Supplier;

@FunctionalInterface
interface MySupplier<T> {
	T get(); // 입력이 없고 반환이 있는거 !
}

class MySupplierImp implements MySupplier<Integer> {
	@Override
	public Integer get() {
		return (int) (Math.random() * 100) + 1;
	}
}



public class Ex01{
	 public static void main(String[] args) {
		 
		 //1. 인터페이스구현 이름있는 클래스
		 MySupplier<Integer> a = new MySupplierImp();
		 
		 
		 
		 //2.익명
		 
		 MySupplier<Integer> b  = new MySupplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 5;
			}};
			 
   		//3. 람다식
		 MySupplier<Integer> c =  ()->5;
		 
		 
		 //3.람다식
		 
		 MySupplier<Integer> d = ()->{
			 return  5;
		 };
		 
		 
		 		 
		 Supplier<Integer> e= ()->7;		 
		 System.out.println( a.get());
		 System.out.println( b.get());
		 System.out.println( c.get());
		 System.out.println( d.get());
		 System.out.println( e.get());
		 
		 
		 
			
	}
}