import java.util.Scanner;

public class 문제2_매운맛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 사원 급여 계산 시스템 ===");
        
        // 1. 입력 데이터 받기
        System.out.print("사원 이름: ");
        String name = sc.next();
        
        System.out.print("구분코드 (1:2000, 2:2500, 3:3000, 4:4000): ");
        int code = sc.nextInt();
        
        System.out.print("작업 시간: ");
        int hours = sc.nextInt();

        int payRate = 0; // 시간당 임금

        // 2. 구분코드에 따른 시급 결정 (switch 사용)
        switch (code) {
            case 1:
                payRate = 2000;
                break;
            case 2:
                payRate = 2500;
                break;
            case 3:
                payRate = 3000;
                break;
            case 4:
                payRate = 4000;
                break;
            default:
                System.out.println("잘못된 구분코드입니다. 임금이 0원으로 계산됩니다.");
                payRate = 0;
                break;
        }

        // 3. 임금 계산
        int salary = payRate * hours;

        // 4. 결과 출력
        System.out.println("\n--- 계산 결과 ---");
        System.out.println("사원명: " + name);
        System.out.println("시간당 임금: " + payRate + "원");
        System.out.println("총 임금: " + salary + "원");

        sc.close();
    }
}