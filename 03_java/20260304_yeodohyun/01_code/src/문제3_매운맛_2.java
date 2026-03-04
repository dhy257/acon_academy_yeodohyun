public class 문제3_매운맛_2 {
    public static void main(String[] args) {
        long a = 1, b = 1;
        int limit = 50;

        for (int i = 1; i <= limit / 2; i++) {
            System.out.print(a + "\n" + b + "\n");
            
            // 변수 2개로 값 갱신
            a = a + b; // 다음 홀수 항
            b = a + b; // 다음 짝수 항
        }
    }
}