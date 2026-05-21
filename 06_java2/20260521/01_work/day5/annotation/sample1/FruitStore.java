package day5.annotation.sample1;

  

public class FruitStore {	
	
	@Count(value=3)
	private int apples;
	
	@Count(5)    //value생략할 수 있다
	private int bananas; 
	
	
	@Count(10)
	private int tomato;
	

	public FruitStore(int apples, int bananas  , int tomato) {
		super();
		this.apples = apples;
		this.bananas = bananas;
		this.tomato  = tomato;		
		
	}


	@Override
	public String toString() {
		return "FruitStore [apples=" + apples + ", bananas=" + bananas + ", tomato=" + tomato + "]";
	}
	
	
	
	
}
