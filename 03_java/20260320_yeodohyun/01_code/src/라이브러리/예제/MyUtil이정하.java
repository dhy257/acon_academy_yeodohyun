package day14.오전실습;

import java.util.Scanner;

public class MyUtil이정하 {
    //별을 3개 출력하기
    public void star() {
        for (int i = 0 ; i < 3 ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //원하는 문자를 3개 출력하기
    public void print(Scanner sc) {
        String string = sc.nextLine();
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println(string);
        }
    }
    //원하는 코드를 3번 출력하기

}
