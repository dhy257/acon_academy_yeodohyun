package day5prac.실습;

public class StarRecursive {

    public static void printStar(int n) {

        // 종료 조건
        if (n == 0) {
            return;
        }

        System.out.print("*");

        // 재귀 호출
        printStar(n - 1);
    }

    public static void main(String[] args) {

        printStar(5);

    }
}