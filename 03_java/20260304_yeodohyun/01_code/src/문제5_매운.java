public class 문제5_매운 {
    public static void main(String[] args) {
        // 0. 데이터 초기화
        long num = 2;   // 첫 번째 항
        long sum = 2;   // 첫 번째 항을 미리 합계에 포함
        int ratio = 3;  // 공비
        int limit = 7;  // 7번째 항까지

        // 1. 반복 시작 (2번째 항부터 계산하므로 i=2 시작)
        for (int i = 2; i <= limit; i++) {
            num = num * ratio; // 현재 항에 공비 3을 곱해 다음 항 생성
            sum += num;        // 합계에 누적
        }

        // 5(3). 결과 출력
        System.out.println("등비수열의 7번째 항까지의 합: " + sum);
        
        // 2 + 6 + 18 + 54 + 162 + 486 + 1458 = 2186
    }
}