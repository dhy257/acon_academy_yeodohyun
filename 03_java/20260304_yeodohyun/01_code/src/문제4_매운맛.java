import java.util.Scanner;

public class 문제4_매운맛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 0. 데이터 초기화
        int totalKor = 0, totalEng = 0, totalMat = 0;
        
        System.out.print("처리할 학생 수는 몇 명입니까? ");
        int MAX = sc.nextInt();

        // 1. 반복 시작
        for (int i = 1; i <= MAX; i++) {
            System.out.println("\n[" + i + "번째 학생 정보 입력]");
            System.out.print("이름: ");
            String name = sc.next();
            System.out.print("국어 영어 수학 점수(공백 구분): ");
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int mat = sc.nextInt();

            // 3. 개인 평균 및 누적 계산
            double avg = (kor + eng + mat) / 3.0;
            totalKor += kor;
            totalEng += eng;
            totalMat += mat;

            // 4. 등급 판단
            String grade = "";
            if (avg >= 90) {
                grade = "EXCELLENT";
            } else if (avg < 60) {
                grade = "FAIL";
            }

            // 5. 개인 결과 출력
            System.out.printf("이름: %s | 국: %d 영: %d 수: %d | 평균: %.2f | %s\n", 
                               name, kor, eng, mat, avg, grade);
        }

        // 6. 과목별 평균 계산
        double avgKor = (double) totalKor / MAX;
        double avgEng = (double) totalEng / MAX;
        double avgMat = (double) totalMat / MAX;

        // 7. 최종 출력
        System.out.println("\n==============================");
        System.out.println("[ 전 과목 평균 점수 ]");
        System.out.printf("국어 평균: %.2f\n", avgKor);
        System.out.printf("영어 평균: %.2f\n", avgEng);
        System.out.printf("수학 평균: %.2f\n", avgMat);
        
        sc.close();
    }
}