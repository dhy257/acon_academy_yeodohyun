package com.d0320.pratice;

class MyUtil_황스일 {

    // 1. 별을 3개 출력하기
    public void printThreeStars() {
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // 2. 원하는 문자를 3개 출력하기
    public void printThreeString(String c) {
        for (int i = 0; i < 3; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    // 3. 원하는 코드를 3번 실행하기
    public void runThreeTimes(Runnable action) {
        for (int i = 0; i < 3; i++) {
            action.run();
        }
    }
}