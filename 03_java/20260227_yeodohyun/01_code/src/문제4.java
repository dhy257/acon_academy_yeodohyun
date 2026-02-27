public class 문제4 {
    public static void main(String[] args) {
        // 0. 데이터 초기화
        int num = 1; // 첫 번째 홀수
        int sum = 0; // 누적 합계

        // 4. 처리 (합계가 1000 이하인 동안 반복)
        while (true) {
            sum += num; // 현재 항을 더함

            // 합계가 1000을 초과했는지 확인
            if (sum > 1000) {
                break; // 초과하는 순간 루프 탈출
            }

            num += 2; // 다음 홀수로 증가 (1, 3, 5, 7...)
        }

        // 5. 출력
        System.out.println("1000을 처음으로 초과하는 시점의 결과");
        System.out.println("마지막 항 (num): " + num);
        System.out.println("초과한 값 (sum): " + sum);
    }
}