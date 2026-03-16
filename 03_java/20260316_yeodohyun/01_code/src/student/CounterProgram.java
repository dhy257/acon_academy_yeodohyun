package com.d0316.practice.objectStaticPractice;

import java.util.Scanner;

class Counter {
    // 인스턴스 변수
    private int count = 0;

    // static 변수
    private static int totalCount = 0;

    // 객체(인스턴스) 메서드
    public void increment() {
        this.count++; // this: 힙(Heap) 메모리에 생성된 '현재 객체'의 count 필드에 접근
        totalCount++; // static: 클래스 영역(Method Area)에 공통으로 존재하는 변수에 접근
        System.out.println("개별 카운트 증가! 현재 내 카운트: " + this.count + "\n");
    }

    // 객체(인스턴스) 메서드
    public int getCount() {
        return this.count; // this 를 사용하여 현재 객체의 count 반환
    }

    // static 메서드
    public static int getTotalCount() {
        return totalCount;
    }
}

public class CounterProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Counter currentCounter = null;

        System.out.println("\n--- 메뉴 선택 ---");
        System.out.println("1. 새로운 객체 생성 \n2. 현재 객체 카운트 증가 \n3. 현재 상태 확인 \n4. 종료");

        loop:
        while (true) {
            System.out.print("입력하시오 : ");

            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1 -> {
                    currentCounter = new Counter();
                    System.out.println("새로운 Counter 객체가 생성되었습니다. \n");
                }
                case 2 -> {
                    if (currentCounter == null) {
                        System.out.println("먼저 객체를 생성(1번)해주세요. \n");
                    } else {
                        currentCounter.increment();
                    }
                }
                case 3 -> {
                    if (currentCounter == null) {
                        System.out.println("생성된 객체가 없습니다. \n");
                    } else {
                        System.out.println("현재 객체 카운트: " + currentCounter.getCount());
                    }
                    System.out.println("전체 누적 카운트: " + Counter.getTotalCount() + "\n");
                }
                case 4 -> {
                    System.out.println("프로그램을 종료합니다.");
                    break loop;
                }
            }
        }
    }
}