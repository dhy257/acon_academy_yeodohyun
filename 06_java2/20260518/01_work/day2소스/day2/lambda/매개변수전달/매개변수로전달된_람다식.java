package day2.lambda.매개변수전달;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class 매개변수로전달된_람다식 {
     
    public static ArrayList<String> 조건으로필터링하기(ArrayList<String> list, Predicate<String> condition) {
       
    	//필터링된 결과를 담기위한 리스트
    	ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            if (condition.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    
    
    public static void main(String[] args) {
         
        ArrayList<String> items= new ArrayList<>();
        items.add("apple");
        items.add("banana");
        items.add("cherry");
        items.add("melon");
        
        // 'a'로 시작하는 문자열만 필터링
        ArrayList<String>  list1 = 조건으로필터링하기(items, s -> s.startsWith("a"));
        System.out.println(list1);  

        // 길이가 5 이상인 문자열만 필터링
        ArrayList<String>  list2 = 조건으로필터링하기(items,   new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				boolean result  = t.length() >= 6;
				return  result ;
			}
		});
        System.out.println(list2);  
        
        
        
    }
}
