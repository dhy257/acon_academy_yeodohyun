package com.d0309.practice;

public class QuestionEasy04 {
    public static void main(String[] args) {
        // 이번주 날씨 정보가 배열로 제공되었다
        // int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
        //     4) 가장 높은 온도를 구하시오

        int[] temperatures = { 33, 35, 32, 35, 36, 35, 34 };

        int max = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }

        System.out.println("가장 높은 온도: " + max);

        // Array 함수(Stream API)
        max = java.util.Arrays.stream(temperatures).max().getAsInt();

    }
}
