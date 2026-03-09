package javaprj.day05;

import java.util.Arrays;
import java.util.Random;

public class 배열문제 {

	public static void main(String[] args) {
		/*
		 * 실습 )
			1. 배열저장출력문제    (값 넣고  출력하기)
			   1) 1차원배열 사용하기 -  일주일점심메뉴 또는 단어  
			   2) 1차원배열 사용하기 -  예상 로또번호  저장하고 출력하기
			   3) 1차원 배열 사용하기 - 좋아하는 음식  5개 저장하고 출력하기
			   4) 2차원배열 사용하기 -  한 달 점심메뉴 또는 단어
			   5) 3차원배열 사용하기
		 */
		//배열 선언
        int[] lotto = new int[6];
        
        //랜덤 객체 선언
        Random random = new Random();
        
        System.out.println("--- 로또 번호 추첨을 시작합니다 ---");

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
            
            for (int j = 0; j < i; j++) {
            	//중복제거
                if (lotto[i] == lotto[j]) {
                    //중복이 발견되면 인덱스 번호를 뒤로 돌려 다시 뽑기
                	i--;
                    break;
                }
            }
        }

        Arrays.sort(lotto);

        System.out.print("이번 주 행운의 번호: ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + (i == lotto.length - 1 ? "" : ", "));
        }
        System.out.println("\n-------------------------------");
        
        System.out.println();
        
        
        int[] arr = new int[5];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        System.out.println("--------------------------");
        System.out.println("버블정렬 전: " + Arrays.toString(arr));
        System.out.println("--------------------------");

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 값 교체
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println((i + 1) + "회전 완료");
            System.out.println("--------------------------");
        }
	}

}
