package day1.generic매서드;

public class NoGenericMethod4 {

    // Integer 비교
    public static Integer getMax(Integer a, Integer b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    // Double 비교
    public static Double getMax(Double a, Double b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    // String 비교
    public static String getMax(String a, String b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("큰 정수: " + getMax(10, 20));
        System.out.println("큰 실수: " + getMax(5.7, 3.14));
        System.out.println("사전순으로 뒤인 문자열: " + getMax("apple", "banana"));
    }
}

