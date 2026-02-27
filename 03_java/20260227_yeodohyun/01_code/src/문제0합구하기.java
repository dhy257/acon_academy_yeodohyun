import java.util.Scanner;

public class 문제0합구하기 {
    public static void main(String[] args) {
        // 0. 데이터 초기화
        int sum = 0; // 합을 저장할 변수
        
        Scanner sc = new Scanner(System.in);

        // 1. 사용자 입력 (몇까지의 합을 구할 것인지)
        System.out.print("1부터 몇까지의 합을 구할까요? : ");
        int limit = sc.nextInt(); // 사용자가 10을 입력하면 1~10의 합

        // 2. 반복 시작 (for문 사용)
        // i가 1부터 input(사용자 입력값)까지 1씩 증가하며 반복
        for (int i = 1; i <= limit; i++) {
            // 2-1. 더하기 (총합 sum에 현재 숫자 i를 누적)
            sum += i;
        }

        // 3~4. 결과 출력 및 종료
        System.out.println("1부터 " + limit + "까지의 합은: " + sum + "입니다.");
        
        sc.close();
    }
}