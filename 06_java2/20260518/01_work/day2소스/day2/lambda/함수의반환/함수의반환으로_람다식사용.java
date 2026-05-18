package day2.lambda.함수의반환;

import java.util.function.BiFunction;

public class 함수의반환으로_람다식사용 {
    
	
    public static BiFunction<Integer, Integer, Integer> 연산자기능얻기(String operation) {
    	
        if (operation.equals("add")) {
            return (a, b) -> a + b; // 덧셈 람다식 반환
        } else if (operation.equals("multiply")) {
            return (a, b) -> a * b; // 곱셈 람다식 반환
        } else {
            return (a, b) -> 0; // 기본값으로 0 반환
        }
    }

    
    
    public static void main(String[] args) {
         
        BiFunction<Integer, Integer, Integer> a = 연산자기능얻기("add");
        System.out.println("5 + 3 = " + a.apply(5, 3));   

        
        BiFunction<Integer, Integer, Integer> b = 연산자기능얻기("multiply");
        System.out.println("5 * 3 = " + b.apply(5, 3));   
    }
}
