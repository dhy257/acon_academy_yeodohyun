package day1.generic매서드;

public class MyGenericMethod1_ {
	//  제네릭 메소드
	//  T : 타입변수. 원하는 어떤 이름으로든 명명 가능   
	
	// 둘 중 하나를 선택해서 반환함 
	public static <T> T pick (T a, T b) {
		return Math.random() > 0.5 ? a : b;
	}
	 
	
	 
	public static void main(String[] args) {
		
		 
        boolean resultBool = MyGenericMethod1_.pick(true, false);
        String resultStr = MyGenericMethod1_.pick("짜장", "짬뽕");	 
        double resultDbl = MyGenericMethod1_.pick(3.5, 6.5);
        
        
        System.out.println( resultBool);
        System.out.println( resultStr);
        System.out.println( resultDbl);
        
        
        
        //지네릭매서드는 매서드를 호출할 때마다 다른 지네릭 타입을 대입할 수 있게 한것이다 
          resultBool = MyGenericMethod1_.<Boolean>pick(true, false);
          resultStr = MyGenericMethod1_.<String>pick("짜장", "짬뽕");	 
          resultDbl = MyGenericMethod1_.<Double>pick(3.5, 6.5);
          
          
          System.out.println( resultBool);
          System.out.println( resultStr);
          System.out.println( resultDbl);
        
        
	}

	
	
}
