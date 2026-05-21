package day5prac.enumEX;

public class 게임케릭터 {

	 String name;
	 CharacterState state;
	 
	 
	 
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
	 
	 
	 //공격하기
	 public void 공격하기() {
		 
		 state  = CharacterState.공격;
		 System.out.println( name  +  state +"로  전환 !!");
	 }
	 
	 //죽기
	 public void 죽기() {
		 state  = CharacterState.죽음;
		 System.out.println( name  +  state +"로  전환 !!");
	 }
	 
	 //수비하기
	 
	 public void 수비하기() {
		 state  = CharacterState.수비;
		 System.out.println( name  +  state +"로  전환 !!");
	 }
	 
	 
	 
	 
}
