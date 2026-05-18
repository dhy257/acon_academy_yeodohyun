package day2.lambda.runnable;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Runnable활용예제2 {
    public static void main(String[] args) {

        // Runnable 객체 등록
        ArrayList<Runnable> doList = new ArrayList<>();
        doList.add(new 주연());
        doList.add(new 안성재());
        doList.add(new 김연아());

        // 메뉴 출력 및 선택
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 실행할 메뉴 선택 ===");
            System.out.println("1. 주연 출력");
            System.out.println("2. 안성재 출력");
            System.out.println("3. 김연아 출력");
            System.out.println("4. 전체 실행");
            System.out.println("0. 종료");
            System.out.print("선택: ");


            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    doList.get(0).run();
                    break;
                case 2:
                    doList.get(1).run();
                    break;
                case 3:
                    doList.get(2).run();
                    break;
                case 4:
                    for (Runnable r : doList) {
                        r.run();
                    }
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
