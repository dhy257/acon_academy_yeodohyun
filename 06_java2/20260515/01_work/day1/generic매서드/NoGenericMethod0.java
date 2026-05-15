package day1.generic매서드;
public class NoGenericMethod0 {

    // int용
    public static void printInt(int a) {
        System.out.println(a);
    }

    // String용
    public static void printString(String a) {
        System.out.println(a);
    }

    // double용
    public static void printDouble(double a) {
        System.out.println(a);
    }

    // char용
    public static void printChar(char a) {
        System.out.println(a);
    }

    // Score용 (사용자 정의 클래스)
    public static void printScore(Score s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        printInt(3);
        printString("hello");
        printDouble(3.5);
        printChar('C');
        printScore(new Score("홍길동"));
    }
}
