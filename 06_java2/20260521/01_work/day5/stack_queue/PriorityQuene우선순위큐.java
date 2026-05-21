package day5.stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQuene우선순위큐 {

	public static void main(String[] args) {
		
		//PriorityQueue 사용해서 사용자 객체를 담을 때는 반드시  Comparable을 구현해야함 !!!		
		// 우선순위  큐    
		Queue pq = new PriorityQueue();		
		//8 9 11   ->  8 9  11
	
		
		pq.offer(new Game("미칠듯잼남" ,100000) );		
		pq.offer(new Game("재미있음" ,20000) );		
		pq.offer(new Game("그냥" ,2000) );	
		pq.offer(new Game("진짜장난아님" ,50000) );
		pq.offer(new Game("별루" ,1000) ); 
		// Queue에서 꺼내기 	 
		
		
		
		// 우선순위 큐는  정렬된 상태로 유지됨 
		// 금액이 가장 작은것부터 꺼내어 진다
		
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
	public void setPrice(int prices) {
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
	@Override                         // 5  3  8 1
	public int compareTo(Game o) {   //오름차순, 결정  내가크면 정렬 ->  오름차순, 반대)내림차순  
		// TODO Auto-generated method stub
		return this.price - o.price;    
	}
}
