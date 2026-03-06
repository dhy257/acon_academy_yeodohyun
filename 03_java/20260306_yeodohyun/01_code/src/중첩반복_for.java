public class 중첩반복_for {
    public static void main(String[] args) {
        // 별 하나로 5개 출력

        // System.out.println("*");
        // System.out.println("*");
        // System.out.println("*");
        // System.out.println("*");
        // System.out.println("*");

        System.out.println("반복문으로 출력하기");
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }

        // 별 하나로 5줄 출력
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
