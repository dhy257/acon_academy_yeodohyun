package day5.annotation.basic;

  

import java.util.ArrayList;

public class Deprecated_SuperessWarnings {

    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("");
    }
    

    // SuppressWarnings : 컴파일러의 경고 무시 
    // Raw type = List, Map 등에서 제네릭을 생략한 타입
     @SuppressWarnings({"unchecked", "rawtypes"})//
    public static void warnedMethod() {
   
    	//  raw type(원시 타입) 사용에 대한 경고
    	//  unchecked  -  제네릭 관련 ‘확인되지 않은(unchecked) 변환/대입’ 경고

        ArrayList list = new ArrayList();
        list.add("감자");
        list.add("고구마");
        list.add("호박");
        System.out.println(list);
    }

    public static void main(String[] args) {
        Deprecated_SuperessWarnings.deprecatedMethod();
        Deprecated_SuperessWarnings.warnedMethod();
    }
    
    
}
