package day1.generic매서드;

public class MyGenericMethod4 {

    // 제네릭 메서드 선언: <T extends Comparable<T>>
    // → T 타입은 Comparable을 구현해야 한다 (compareTo 사용 가능)
    public static <T extends Comparable<T>> T getMax(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    
     //Integer
     //String은   모두 Comparable 인터페이스를 구현했음 
    
    public static void main(String[] args) {
        // Integer 비교
        int maxInt = getMax(10, 20);
        System.out.println("큰 정수: " + maxInt);
 
        // Double 비교
        double maxDouble = getMax(5.7, 3.14);
        System.out.println("큰 실수: " + maxDouble);

        // String 비교 (사전순)
        String maxString = getMax("apple", "banana");
        System.out.println("사전순으로 뒤인 문자열: " + maxString);
    }
}