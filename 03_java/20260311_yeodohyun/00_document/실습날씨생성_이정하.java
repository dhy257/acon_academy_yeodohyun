package day07;

import java.util.Scanner;

public class 실습날씨생성_이정하 {

    public static void weather(int day) {
        String[] weather = {"맑음", "흐림", "비", "눈"};
        System.out.println(day + "일 날씨 : " + weather[(int)(Math.random()*4)]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("날짜 입력: ");
        int day = sc.nextInt();

        weather(day);

    }
}
