package pro260309;

public class 배열_3차원_김태준 {
		
	public static void main(String[] args) {
		
		String[][][] java_목차 = {
				//0면 
				{
					{"변수와_자료형","연산자","형변환"}, //기초문법
					{"조건문(if,swich)","반복문(for,while)"}, //제어문
					{"1차원_배열","2차원_배열","3차원_배열","배열의_메모리_구조"} //배열
				},
				//1면
				{	{"클래스와_객체","매서드","생성자"}, //객체 지향 기초
					{"상속(Inheritance)","오버로딩과_오버라이딩"}, //객체지향 확장
					{"인터페이스(Interface)","추상_클래스","다형성"} //설계와 다향성
				},
				
				//2면
				{
					{"예외_처리(Expection)","try-catch","throw"}, //예외처리
					{"List","Set","Map(해쉬 맵)"}, //컬렉션 프레임워크
					{"Thread(쓰레드)","파일_입출력(I/O)","람다식"} //고급 활용
				}
				
		};
		
			
		for(int i=0; i<java_목차.length;i++) {
			
			if(i==0) {
				System.out.println(i+"면: "+"기초");
			}else if(i==1) {
				System.out.println("");
				System.out.println(i+"면: "+"중급");
			}else if(i==2) {
				System.out.println("");
				System.out.println(i+"면: "+"고급");
			}
			
			for(int j=0; j<java_목차[i].length;j++) {
				
				if(i==0) {
					if(j==0) {
						System.out.print("기초문법: ");
					}else if(j==1) {
						System.out.print("제어문: ");
					}else if(j==2) {
						System.out.print("배열: ");
					}
				}else if(i==1) {
					if(j==0) {
						System.out.print("객체지향 기초: ");
					}else if(j==1) {
						System.out.print("객체지향 확장: ");
					}else if(j==2) {
						System.out.print("설계와 다향성: ");
					}
				}else if(i==2) {
					if(j==0) {
						System.out.print("예외처리: ");
					}else if(j==1) {
						System.out.print("컬렉션 프레임워크: ");
					}else if(j==2) {
						System.out.print("고급 활용: ");
					}
				}
				for(int k=0; k< java_목차[i][j].length;k++) {
					System.out.print(java_목차[i][j][k]+ " ");
				}
				System.out.println("");
			}
		}
		
		
		String[] 목차_면 = {"기초","중급","고급"};
		String[][] 목차_행 = {
				{"기초문법","제어문","배열"},
				{"객체지향 기초","객체지향 확장","설계와 다향성"},
				{"예외처리","컬렉션 프레임워크","고급 활용"}
		};
		
		
		for(int i=0;i<3;i++) {
			System.out.println("-------------------");
		}
		
		
		
		for(int i=0; i<java_목차.length;i++) {
			
			System.out.println("\n"+i + "면: "+목차_면[i]);
			
			for(int j=0; j<java_목차[i].length;j++) {
				
				System.out.print(목차_행[i][j]+ ": ");
				
				for(int k=0; k< java_목차[i][j].length;k++) {
					System.out.print(java_목차[i][j][k]+ " ");
				}
				System.out.println("");
			}
		}
		
	}
}
