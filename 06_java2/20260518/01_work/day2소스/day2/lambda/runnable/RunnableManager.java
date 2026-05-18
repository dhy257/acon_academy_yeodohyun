package day2.lambda.runnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunnableManager {

    private List<Runnable> doList = new ArrayList<>();

    // Runnable 등록
    public void add(Runnable r) {
        doList.add(r);
    }

    // 메뉴 실행
    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램 종료");
                sc.close();
                break;
            } else if (choice >= 1 && choice <= doList.size()) {
                execute(choice - 1); // 선택 실행
            } else if (choice == doList.size() + 1) {
                executeAll(); // 전체 실행
            } else if (choice == doList.size() + 2) {
                registerMenu(sc); // 등록 메뉴
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 메뉴만 보여주기
    private void showMenu() {
        System.out.println("\n=== 실행할 메뉴 선택 ===");
        for (int i = 0; i < doList.size(); i++) {
            System.out.println((i + 1) + ". " + doList.get(i).getClass().getSimpleName() + " 실행");
        }
        System.out.println((doList.size() + 1) + ". 전체 실행");
        System.out.println((doList.size() + 2) + ". Runnable 등록");
        System.out.println("0. 종료");
    }

    // 선택한 Runnable 실행
    public void execute(int index) {
        doList.get(index).run();
    }

    // 전체 실행
    public void executeAll() {
        for (Runnable r : doList) {
            r.run();
        }
    }

    // 등록 메뉴
    private void registerMenu(Scanner sc) {
        System.out.println("\n=== 등록할 Runnable 선택 ===");
        System.out.println("1. 주연");
        System.out.println("2. 안성재");
        System.out.println("3. 김연아");
        System.out.print("선택: ");
        int choice = sc.nextInt();

        switch (choice) {
        case 1:
            add(new 주연());
            break;
        case 2:
            add(new 안성재());
            break;
        case 3:
            add(new 김연아());
            break;
        default:
            System.out.println("잘못된 선택입니다.");
    }
    System.out.println("등록 완료!");
    }
}
