package day5.재귀호출;

public class StarPrinter {

    // 재귀함수로 별 출력
    public static void printStars(int n) {
        // 종료 조건: 별을 더 이상 출력하지 않도록 하는 조건
        if (n == 0) {
            return; // 종료
        }

        // 현재 줄에 n 개의 별을 출력
        printStars(n - 1); // 재귀 호출
        for (int i = 0; i < n; i++) {
            System.out.print("*"); // 별 출력
        }
        System.out.println(); // 줄 바꿈
    }

    public static void main(String[] args) {
        int height = 5;  // 출력할 별의 높이
        printStars(height);  // 재귀 함수 호출
    }
}
