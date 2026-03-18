package javaprj.day12.맛있는다형성;

public class AcornStudent {

	String name;
	int age;
	
	
	public AcornStudent( String name, int age) {
		
		this.name = name;
		this.age  = age;
	}
	
	
	
	
	
	public String toString() {
		return name+age;
	}
	
	
	//기능	 상속받은 자식이 오버라이드 하기 
	public void 음료마시기() {
		System.out.println("================>>>>??");
	}
	
	
}



//1. AcornStudent   상속받기 
//2. 클래스이름 상관없으나 충돌을 방지하기 위햇 WJY붙이기
//3. 생성자만들기
//4. 음료마시기 오버라이드 하기  ( 우주연  초코라떼포당  먹고싶어요 );

//5. 전체속성값 출력하기 (이름, 나이 출력하기)



//=> 