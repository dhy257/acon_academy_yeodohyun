public class 문제3_매운맛_1 {
    public static void main(String[] args) {
        long a = 1, b = 1, c;
        int limit = 50;

        // 1, 2항 먼저 출력
        System.out.print(a + "\n" + b + "\n");

        // 3항부터 계산 시작
        for (int i = 3; i <= limit; i++) {
            c = a + b;
            System.out.print(c + "\n");
            
            // 다음 계산을 위해 값 밀어내기
            a = b;
            b = c;
        }
    }
}