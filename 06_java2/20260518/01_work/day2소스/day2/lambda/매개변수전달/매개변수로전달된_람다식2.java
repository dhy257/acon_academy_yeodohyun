package day2.lambda.매개변수전달;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.BiFunction;

public class 매개변수로전달된_람다식2 {
	
	
    // 두 숫자와 연산을 전달받아 결과를 반환하는 메서드
    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        
        int sum = calculate(5, 3, (x, y) -> x + y);
        System.out.println("덧셈: " + sum);   

       
        int product = calculate(5, 3, (x, y) -> x * y);
        System.out.println("곱셈: " + product);  //  
    }
}
