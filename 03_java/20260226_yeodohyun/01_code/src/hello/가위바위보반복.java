package hello;

import java.util.Scanner;

public class 가위바위보반복 {

    public static void main(String[] args) {
        String userName = "";
        int user;
        String result = "";
        int computer;
        int retry; // 다시 할지 결정하는 변수 추가

        Scanner sc = new Scanner(System.in);

        System.out.println("사용자 이름을 입력하세요");
        userName = sc.nextLine();

        // [추가] 전체 게임 반복문: 지거나 이겼을 때 다시 할지 결정
        while (true) {

            // 1. 무승부 반복문 (비기면 계속 다시 함)
            while (true) {
                System.out.println("\n--- 가위바위보 대결! ---");
                System.out.print("사용자 가위(0) 바위(1) 보(2) 입력: ");
                user = sc.nextInt();
                computer = (int) (Math.random() * 3);

                System.out.println("사용자: " + user + " vs 컴퓨터: " + computer);

                if (user != computer) {
                    break; // 비기지 않았을 때만 탈출
                }
                System.out.println("무승부입니다! 다시 입력하세요.");
            }

            // 2. 사용자 승패 구하기
            if (user == 0) {
                result = (computer == 2) ? "사용자 승" : "사용자 패";
            } else if (user == 1) {
                result = (computer == 0) ? "사용자 승" : "사용자 패";
            } else if (user == 2) {
                result = (computer == 1) ? "사용자 승" : "사용자 패";
            }

            // 3. 승패 출력
            System.out.println("\n[" + userName + "님 결과] " + result);

            // [추가] 패배 시 혹은 게임 종료 후 재도전 여부 확인
            if (result.equals("사용자 패")) {
                System.out.print("지셨네요... 다시 도전하시겠습니까? (1:예, 0:아니오): ");
            } else {
                System.out.print("축하합니다! 한 판 더? (1:예, 0:아니오): ");
            }
            
            retry = sc.nextInt();
            if (retry == 0) {
                System.out.println("게임을 종료합니다. 고생하셨습니다!");
                break; // 바깥쪽 while문 종료
            }
        }
        
        sc.close();
    }
}