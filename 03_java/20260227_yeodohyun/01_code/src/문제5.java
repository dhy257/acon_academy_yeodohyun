import java.util.Scanner;

public class 문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 0. 데이터 초기화
        int sum = 0;
        int limit = 5;
        
        System.out.println(limit + "개의 정수를 입력하세요:");

        // 1~3. 반복 및 누적 처리
        for (int i = 1; i <= limit; i++) {
            // 입력을 반복문 안에서 받음
            int input = sc.nextInt();
            sum += input;
        }

        // 4. 평균 계산 (소수점 표현을 위해 1000.0으로 나눔)
        double avg = (double) sum / limit;

        // 5. 결과 출력
        System.out.println("\n--- 계산 결과 ---");
        System.out.println("총합(Sum): " + sum);
        System.out.println("평균(Average): " + avg);

        sc.close();
    }
}