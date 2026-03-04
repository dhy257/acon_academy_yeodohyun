public class 문제1_매운맛 {
    public static void main(String[] args) {
        // 0. 데이터 초기화 (1999년 기준)
        int year = 1999;
        double hPop = 2500000; // H시 250만
        double kPop = 1800000; // K시 180만
        
        final double hRate = 0.036; // 3.6%
        final double kRate = 0.042; // 4.2%

        // 4. 처리 로직 (K시 인구가 H시 인구보다 많아질 때까지 반복)
        while (kPop <= hPop) {
            // 매년 인구 증가 계산 (복리 방식)
            hPop += (hPop * hRate);
            kPop += (kPop * kRate);
            
            // 연도 증가
            year++;
        }

        // 5. 결과 출력
        System.out.println("K시의 인구가 H시보다 많아지는 해는 " + year + "년입니다.");
        System.out.printf("최종 인구 - H시: %.0f명, K시: %.0f명\n", hPop, kPop);
    }
}