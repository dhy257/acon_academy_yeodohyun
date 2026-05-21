package day5.annotation.sample1;

import java.lang.reflect.Field;

public class ValidationUtils {	
	public static void main(String[] args) throws IllegalAccessException {		
		//FruitStore  fruitStore = new FruitStore(3,5, 10);		  // 실제값은 3, 4개씩 적용됨		
		FruitStore  fruitStore = new FruitStore(3,5, 8);		  // 실제값은 3, 4개씩 적용됨		
			
		필드검증하기( fruitStore);	
		
		 
	}

	
	                
    public static void 필드검증하기(Object obj) throws IllegalAccessException {    
    	
    	//객체의 정보가져오기
    	Class<?>     clazz = obj.getClass();      
        
        //객체의 정보로 부터 선언된 필드가져오기
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
        	//field에 대해 Count 애너테이션정보 얻어오기
            Count annotation = field.getAnnotation(Count.class);

            //field에 애너테이션이 있으면 
            if (annotation != null) {
                field.setAccessible(true);  // private 이어도 접근가능하도록 한다
                int value = (int) field.get(obj);  //객체정보 제공 => 필드의 값얻어오기
                 
          
                int expectedValue = annotation.value();   //애너테이션에 설정한 값
                System.out.println(  field.getName() + "기대수량:" +expectedValue);
                int fieldValue =  value;             //실제 변수값
 
                if (fieldValue != expectedValue) {
                    throw new IllegalArgumentException(
                              field.getName() + "항목은  "+ expectedValue+ " 값이어야 해 !! " );
                    
                    
                }else {
                	System.out.println("성공");
                }
                
                 
            }
        }
    }
}
