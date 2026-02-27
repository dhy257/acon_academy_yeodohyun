import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 입력
        System.out.print("n의 값을 입력하세요: ");
        int n = sc.nextInt();
        
        long totalSum = 0;

        
        for (int i = 1; i <= n; i++) {
            totalSum += (long) i * (n - i + 1);
        }

        // 5. 출력
        System.out.println("결과: " + totalSum);
        
        sc.close();
    }
}