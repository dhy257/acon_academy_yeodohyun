package day5.stack_queue;
import java.util.*;

class StackQueueEx {
	public static void main(String[] args) {
		
		// 자료구조 란 ? 데이터를 어떻게 저장할 것인냐에 대한 문제
		// 저장하는 방법, 꺼내는 방법 
		
		// 스택 :  먼저들어간것이 맨 마지막에 나오는 구조    1 2 3     ->  3  2  1   (스택 ): 막힌 빨래통 
		// 큐 :   먼저들어간것이 먼저 나오는 구조  :      1 2 3     ->  1  2  3   
		
		Stack<String> st = new Stack();
		Queue<String> q = new LinkedList();	 // Queue인터페이스의 구현체인 LinkedList를 사용
		                                     // LinkedList, PriorityQuenue 기억하기
		
		 		
		//스택에 값 저장   push
		st.push("one");
		st.push("two");
		st.push("three"); 
		
		
		
		//실습 
		//String value  =st.pop();
		//System.out.println("value =" + value);
		 
		
		//현재가리키는 객체정보 얻어오기 
		Object curr = st.peek(); 
		System.out.println( "현재 가르키는 객체 " + curr);
		

		//큐에 값 저장 offer
		q.offer("0");
		q.offer("1");
		q.offer("2");
		 

		
		//pop
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());  // 마지막값부터 꺼내진다
		}		

		//poll
		System.out.println("= Queue =");  //맨먼저 넣은 값부터 꺼내진다
		while(!q.isEmpty()) {
			System.out.println(q.poll()); 
		}
	}
}
