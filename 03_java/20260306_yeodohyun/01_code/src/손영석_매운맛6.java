public class 손영석_매운맛6 {
    public static void main(String[] args) {
        // 분모 구하기

        // 1 2 3 4
        // 1! 2! 3! 4!
        // 1*1 1*2 1*2*3 1*2*3*4

        // 1.반복문으로 항 구하기 (1~항 순번까지 곱)
        // 2.이전항 이용 (이전항+항의 순번):2번째 항 부터 구하기

        // int sum = 0;
        // int a = 1;
        // for(int i=2;i<=5;i++){
        // a*=i; // a=a*i
        // sum+=a;
        // System.out.println(sum);
        // }
        // /*
        // i a sum
        // 2 2 3
        // 3 6 9
        // 4 24 33
        // 5 120 153
        // */
        // ==========================================

        int n = 5; // 몇번째 항 까지

        // 출력
        double sN = 0; // 전체(분수항 합계)
        // 분모
        long nPact = 1l;
        // 항
        double aN;
        int sign = -1; // 부호

        for (int i = 1; i <= n; i++) {
            // 분모
            nPact *= i;
            sign = -sign;

            // 항
            aN = (i / (double) nPact) * sign; // 부호가 있는 항

            // 누적
            sN += aN;
        }
        System.out.println(sN);

    }
}
