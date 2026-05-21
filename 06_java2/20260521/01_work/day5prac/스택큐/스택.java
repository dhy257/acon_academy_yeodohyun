package day5prac.스택큐;

import java.util.Stack;

public class 스택 {
	public static void main(String[] args) {
		// 스택 : 데이터저장 : push, 꺼내기 ( 맨 위에서부터, 마지막에 있는 내용까지 ) pop

		Stack<String> list = new Stack<>();

		list.push("파랑");
		list.push("빨강");
		list.push("초록");

		// 데이터 보기( 현재위치 )
		String current = list.peek();
		System.out.println("현재 위치 데이터 : " + current);

		// 데이터 꺼내기
//		String pop1 = list.pop();
//		System.out.println(pop1);
//
//		String pop2 = list.pop();
//		System.out.println(pop2);
//
//		String pop3 = list.pop();
//		System.out.println(pop3);

		while (!list.isEmpty()) {
			String pop1 = list.pop();
			System.out.println(pop1);
		}
		System.out.println("스택은 마지막에 넣은 값이 먼저나오는 LIFO 구조이다.");

	}
}
