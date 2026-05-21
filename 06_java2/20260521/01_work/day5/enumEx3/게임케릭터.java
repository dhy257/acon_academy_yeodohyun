package day5.enumEx3;

public class 게임케릭터 {
	
	String name;
	CharacterState  state;
	
	public 게임케릭터() {
		// TODO Auto-generated constructor stub
	}
	

	public 게임케릭터(String name ) {
		super();
		this.name = name;
		this.state = CharacterState.정상;
	}
	
	public 게임케릭터(String name, CharacterState state) {
		super();
		this.name = name;
		this.state = state;
	}
	
	
	
	@Override
	public String toString() {
		return "게임케릭터 [name=" + name + ", state=" + state + "]";
	}
	
	
	
	//
	public void  공격하기() {
		state  = CharacterState.공격;
		System.out.println( name  + state   +"로 전환 되었다");
	} 

	
	public void 죽기() {
		state = CharacterState.죽음;
		System.out.println( name  + state   +"로 전환 되었다");
	} 
	
	public void 수비하기() {
		state= CharacterState.수비;
		System.out.println( name  + state   +"로 전환 되었다");
	} 
	public void printState() {
		System.out.println( name  + state    +"입니다");
	}

}
