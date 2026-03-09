package com.d0309.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice_황스일 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        * 1. 인원수 입력
        * 2. 이름 입력
        * 3. 배열을 랜덤하게 섞음 (Fisher-Yates 셔플 알고리즘)
        * 4. 팀 수 입력
        * 5. 출력
        * */

        // 1. 인원수 입력
        System.out.print("사람의 숫자를 입력하시오: ");
        int count = sc.nextInt();
        sc.nextLine();

        // 2. 이름 입력
        String[] members = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ". 이름을 입력하시오 : ");
            members[i] = sc.nextLine();
        }

        // 3. 배열을 랜덤하게 섞음
        Random rand = new Random();
        for (int i = 0; i < members.length; i++) {
            int randomIndex = rand.nextInt(members.length); // B 바꾸기로 결정
            String temp = members[randomIndex]; // B를 temp 에 복사
            members[randomIndex] = members[i]; // member[i]를 B의 자리에 덮어씀
            members[i] = temp; // 복사했던 temp 를 member[i] 자리에 넣음
        }
        System.out.println("셔플 완료 : " + Arrays.toString(members));
        System.out.println();

        // 4. 팀 수 입력
        System.out.print("팀 수를 입력하시오 : ");
        int teamCount = sc.nextInt();
        System.out.println();

        // 5. 출력
        System.out.println("--- 결과 ---");
        for (int i = 1; i <= teamCount; i++) {
            System.out.print("Team " + i + ": ");
            for (int j = 0; j < members.length; j++) {
                // 인덱스를 팀 수로 나눈 나머지(0 ~ teamCount-1)가 현재 팀 번호와 일치하면 출력
                if ((j % teamCount) == (i - 1)) {
                    System.out.print(members[j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();


    }
}
