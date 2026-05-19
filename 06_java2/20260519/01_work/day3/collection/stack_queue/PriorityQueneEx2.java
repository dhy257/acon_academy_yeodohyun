package day3.collection.stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueneEx2 {

	public static void main(String[] args) {
		
		
		// 먼저 넣는게 먼저 나오는 자료구조 
		// 우선순위 큐는  
		
		//PriorityQueue 사용해서 객체를 담을 때는 반드시  Comparable을 구현해야함 !!!		
		// 우선순위  큐는 우선순위가 기준에 따라서  먼저 나옴
		
		
		Queue pq = new PriorityQueue();		
	
		pq.offer(new Game("미칠듯잼남" ,100000) );		
		pq.offer(new Game("재미있음" ,20000) );		
		pq.offer(new Game("그냥" ,2000) );	
		pq.offer(new Game("진짜장난아님" ,50000) );
		pq.offer(new Game("별루" ,1000) ); 
		// Queue에서 꺼내기 	 
		
		while (!pq.isEmpty()) {
		    Object o = pq.poll();
		    System.out.println(o);
		}
		
		
	}
	
	
	
	
	
	
}



//Comparable 인터페이스 구현하기
class Game  implements Comparable<Game>{
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Game(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}
	
	public Game() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Game o) {
		// TODO Auto-generated method stub
		return o.price - this.price;    // 낮은거 ,  높은거  기준정함!!
	}
}
