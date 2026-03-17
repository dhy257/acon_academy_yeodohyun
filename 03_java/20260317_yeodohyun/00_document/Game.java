package javaprj.day11.변수종류_초기화;

public class Game {
	String name;
	int price;	
	static  int cnt; 
	//생성자
	
	
	//인스턴스변수 초기화 블럭
	//생성자보다 먼저 동작 
	//생성자에서 공통적으로 작업해야 하는 코드가 있을 때 
	{
		cnt++;
		
	}
	
	
	public Game() {
		//cnt++;
		
	}
	
	public Game(String name, int price) {
		// 
		//cnt++;
		
		this.name = name;
		this.price = price;		
	}
	
	//toString
	public String toString() {
	  return name +  "  " +price;
	}
	
	public static  void printCount() {
		System.out.println( cnt);
	}

}
