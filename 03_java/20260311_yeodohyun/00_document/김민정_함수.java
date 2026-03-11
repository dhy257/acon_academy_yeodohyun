package javaprj.day07;

import java.util.Arrays;
import java.util.Scanner;

public class 김민정_함수 {
	
	/*
	 기능:오늘의운세 한 줄 랜덤 출력하기
	 입력:x
	 반환:오늘의운세 한 줄 랜덤하게
	 */
    

    public static String[] 오늘의운세() {
        String[] today = {
            "생각지도 못한 곳에서 작은 행운이 찾아오니, 주변을 세심하게 살펴보는 하루를 보내세요.",
            "서두르기보다는 천천히 한 걸음씩 나아갈 때, 비로소 원하는 목적지에 닿을 수 있습니다.",
            "오랫동안 고민하던 일에 대한 해결의 실마리가 풀리고, 마음의 짐을 덜게 될 것입니다.",
            "오늘은 타인의 의견에 귀를 기울이기보다, 자신의 직관을 믿고 밀고 나가는 것이 유리합니다.",
            "새로운 인연이 당신의 일상에 긍정적인 활력을 불어넣어 줄 기분 좋은 예감이 드는 날입니다."
        };
        return today;
    } 

    

    public static void main(String[] args) {
        String[] result = 오늘의운세();
        int index = (int)(Math.random()*result.length);
        
       
        System.out.println("🍀오늘의 운세를 확인하세요🍀");
        System.out.println("-------------------------------------------------------------");
        System.out.println(result[index]);
    } 

} 