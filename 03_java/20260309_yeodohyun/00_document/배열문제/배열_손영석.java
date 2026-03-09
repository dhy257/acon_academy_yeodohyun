package array.ex;

import java.util.Scanner;

/*실습 )
1. 배열저장출력문제    (값 넣고  출력하기)
   4) 2차원배열 사용하기
  */

/*영화관 좌석 상태 2차원 배열  : 행과 열을 입력하면 해당 좌석이 예매 중인지 확인
                        1) 예매 완료된 좌석(1) 이라면 다시 입력받기
                        2) 예매 미완 좌석(0) 이라면 예매 후 다시 입력받기
                        3) 입력 시에 다른 값들을 넣으면 반복 종료
                        */

public class Array2DPrac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] SeatBook = {
                {1, 0, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}


        };


        loop: while (true) {
            System.out.println("예매할 좌석(행(알파벳), 열(숫자)을 입력하세요");

            System.out.print("알파벳(A,B,C,D,E) :");
            String rows = sc.nextLine();
            int numRows;
            switch (rows) {
                case "A" -> numRows = 0;
                case "B" -> numRows = 1;
                case "C" -> numRows = 2;
                case "D" -> numRows = 3;
                case "E" -> numRows = 4;
                default -> {
                    System.out.println("종료합니다");
                    break loop;
                }
            }

            System.out.print("열(1~6) : ");
            int cols = sc.nextInt();
            sc.nextLine();
            cols--;
            if(cols <0 || cols >5){
                System.out.println("종료합니다");
                break loop;
            }


            if(SeatBook[numRows][cols] == 0){
                System.out.println("예약이 가능합니다");
                System.out.println("예약하시겠습니까? Yes : [Y], No : [N] 입력 / Y,N을 제외한 입력 시 종료");
                String booking = sc.nextLine();
                if(booking.equals("Y")){
                    SeatBook[numRows][cols] = 1;
                    System.out.println("예약되었습니다");
                }
                else if(booking.equals("N")){
                    System.out.println("예약이 취소 되었습니다");
                }
                else{
                    System.out.println("종료합니다");
                    break loop;
                }
            }
            else{
                System.out.println("예약이 불가합니다");
            }


        }
        sc.close();


    }
}
