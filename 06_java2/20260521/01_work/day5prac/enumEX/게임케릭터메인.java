package day5prac.enumEx;

public class 게임케릭터메인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		게임케릭터  영웅  = new 게임케릭터("영웅");
		게임케릭터  전사  = new 게임케릭터("전사");
		게임케릭터  마법사  = new 게임케릭터("마법사");
		게임케릭터  영웅2  = new 게임케릭터("영웅2" ,  CharacterState.수비);
		
		
		
		System.out.println(영웅);
		System.out.println(전사);
		System.out.println(마법사);
		System.out.println(영웅2);
		
		
		//캐릭터 
		영웅.공격하기();
		전사.수비하기();
		마법사.죽기();
		
		
		System.out.println(영웅);
		System.out.println(전사);
		System.out.println(마법사);
		
	}

}
