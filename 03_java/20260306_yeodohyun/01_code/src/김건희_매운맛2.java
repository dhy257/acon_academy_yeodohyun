import java.util.Scanner;

public class 김건희_매운맛2 {
    public static void main(String[] args) {
        // 입력
        int time;
        int code;
        String name;
        // 기본자료형 int(바이트, 숏, 롱) 더블(플롯), char, boolean

        // 출력
        // 임금
        int result;

        // 처리
        int pay;

        Scanner sc = new Scanner(System.in);

        time = sc.nextInt();
        code = sc.nextInt();
        name = sc.nextLine();

        if (code == 1) {
            pay = 2000;
        } else if (code == 2) {
            pay = 2500;
        } else if (code == 3) {
            pay = 3000;
        } else if (code == 4) {
            pay = 4000;
        } else {
            pay = 0;
        }
        result = pay * time;
        System.out.println(result);

    }
}
