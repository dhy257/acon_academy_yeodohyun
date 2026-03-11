package javaprj.day07;

import java.util.Scanner;

public class 함수_이용찬_예제 {
	
	public static String choiceMenu(String category) {
		String[][] menu = {
				{"짜장면", "짬뽕", "볶음밥"},//중식
				{"파스타", "스테이크", "리조또"},//양식
				{"비빔밥", "고등어구이", "된장찌개"}//한식
		};
		
		int choice = (int) Math.random()*3;
		
		switch(category) {
		case "중식": 
			return menu[0][choice];
		case "양식":
			return menu[1][choice];
		case "한식":
			return menu[2][choice];
		default:
			return "없는 카테고리입니다.";
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카테고리를 고르시오.(중식, 양식, 한식)");
		String category = sc.next();
		String menu = choiceMenu(category);
		System.out.println(menu);
	}
	
}
