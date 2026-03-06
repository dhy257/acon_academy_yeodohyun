import java.util.Scanner;

public class 제어문_break2 {
    public static void main(String[] args) {
        // 메뉴 입력받아 출력

        // 1.입력 2.조회 3.변경 4.종료

        int menu;
        Scanner sc = new Scanner(System.in);
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("입력한다");
                break;
            case 2:
                System.out.println("조회한다");
                break;
            case 3:
                System.out.println("변경한다");
                break;
            case 4:
                System.out.println("종료한다");
                break;
            default:
                System.out.println("메뉴X");
        }

    }
}
