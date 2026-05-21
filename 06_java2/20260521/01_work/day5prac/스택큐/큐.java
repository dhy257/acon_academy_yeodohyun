package day5prac.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Queue<String> q = new LinkedList<>();

		// 데이터 넣기
		q.offer("데이터1");
		q.offer("데이터2");
		q.offer("데이터3");

		// 데이터 꺼내기
		String o = q.poll();
		System.out.println(o);
	}

}
