public class 고지연매운맛1 {
    public static void main(String[] args) {
        // 1999년
        // k시 인구 1800000
        // h시 인구 2500000

        // k시 인구가 h시 인구보다 많아지는 해는?

        // 출력
        int result;

        // 처리
        int year = 1999;
        long rise_k = 1800000;
        long rise_h = 2500000;

        while (rise_k <= rise_h) {
            year += 1;
            rise_k *= (1 + 0.036);
            rise_h *= (1 + 0.042);
            System.out.println(rise_k);
            System.out.println(rise_h);
            System.out.println(year);
        }
        result=year;
        System.out.println(year);

    }
}
