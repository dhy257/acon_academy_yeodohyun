import java.util.Scanner;

public class 제어문_dowhile2 {
    public static void main(String[] args) {
        // 입력 유효성 체크
        // 올바른 값이 읿력될 때까지 입력받기

        /*
         * do{
         * }while();
         */

        int math;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("수학점수 입력");
            math = sc.nextInt();
        } while (math < 0 || math > 100);

        System.out.println("수학점수:" + math);
    }
}
