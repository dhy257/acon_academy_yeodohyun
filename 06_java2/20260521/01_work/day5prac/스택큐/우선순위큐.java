package day5prac.스택큐;

import java.util.PriorityQueue;
import java.util.Queue;

public class 우선순위큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Game> pq = new PriorityQueue<>();

		// 데이터 저장
		pq.offer(new Game("미칠듯잼남" ,100000) );		
		pq.offer(new Game("재미있음" ,20000) );		
		pq.offer(new Game("그냥" ,2000) );	
		pq.offer(new Game("진짜장난아님" ,50000) );
		pq.offer(new Game("별루" ,1000) );
		
		// 데이터 꺼내기
		
		// 우선순위 큐는 정렬된 상태로 유지됨
		// 객체는 정렬이 가능한 객체로 만들어야 한다. Comparabkle 구현해야함
		
		while(!pq.isEmpty()) {
			Game g = pq.poll();
			System.out.println(g);
		}
	}

}
