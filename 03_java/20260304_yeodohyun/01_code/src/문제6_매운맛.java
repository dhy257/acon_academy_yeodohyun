public class 문제6_매운맛 {
    public static void main(String[] args) {
        // 0. 데이터 초기화
        double sum = 0.0;
        double fact = 1.0;
        int limit = 10; // 없이 해도 되는데 나중에 입력받거나 바꾸고 싶을때를 위해 추가

        // 1. 반복 처리
        for (int i = 1; i <= limit; i++) {
            // 팩토리얼 누적 계산 (1!, 2!, 3! ...)
            fact *= i;

            // 홀수 번째는 더하고, 짝수 번째는 뺀다
            if (i % 2 != 0) {
                sum += (i / fact);
            } else {
                sum -= (i / fact);
            }
        }

        // 5(3). 결과 출력
        System.out.println("수열의 합 (1 - 2/2! + 3/3! ... - 10/10!):");
        System.out.printf("최종 합계: %.10f\n", sum);
    }
}