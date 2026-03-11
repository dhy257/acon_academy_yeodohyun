package javaprj.day07;

import java.util.Scanner;

public class 실습_화폐매수구하기_나해수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);		
		int money;	 
		
		money = sc.nextInt();
		
		int a = money / 50000;     //오만원권
		money = money % 50000;     //잔액
		
		int b = money / 10000;    //만원권
		money = money % 10000;    //잔액
		
		int c = money / 5000;
		money = money % 5000;
		
		int d = money / 1000;
		money = money % 1000;
		
		int e = money / 500;
		money = money % 500;
		
		int f = money / 100;
		money = money % 100;
		
		int g = money / 50;
		money = money % 50;
		
		int h = money / 10;
		money = money % 10;
		
		System.out.println("오만원 = " + a);
		System.out.println("만원 = " + b);
		System.out.println("오천원 = " + c);
		System.out.println("천원 = " + d);
		System.out.println("오백원 = " + e);
		System.out.println("백원 = " + f);
		System.out.println("오십원 = " + g);
		System.out.println("십원 = " + h);
		 
		
		
		
		
	}

}
