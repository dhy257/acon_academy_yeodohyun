package pro260304;

import java.util.Scanner;

public class 올바른괄호 {
	
	public static void main(String[] args) {
	
	/*	음 일단 필요한 걸 정리해보자.
	 *  괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	 *  받아낼 Scanner가 필요하니 만들어주자.
	 *  
	 *  (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	 *  확인할 수 있는 if문을 만들어주자. 어떻게 만들어야 할까? (와 )의 갯수가 같은가를 볼 수 있지만
	 *  그것은 만약 )가 ( 앞에 생기게 만들면 오류가 없기에 그렇게 하면 안된다.
	 *  먼저 ( 가 앞에 둬야 한다는 조건을 줘도 안된다. 여러개가 중첩되면 )가 ( 앞에 갈 가능성이 생긴다.
	 *  입력설명                                                                                  
	 * 	첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다. 
	 *  출력설명                   
	 *  첫 번째 줄에 YES, NO를 출력한다.              
	 *  
	 *  count라는 변수를 만들어보자.(가 나온다면 +1. )가 나온다면 -1을 해주자.
	 *  만약 count가 도중에 -1이 된다면 그것은 )가 먼저 ( 보다 빨리 나왔단 뜻이니 () 구조가 무너졌다는 뜻이다.
	 *  반대로 +1이나 +2가 되었더라도 그것은 아직 닫히지 않았단 뜻이니 괜찮다.
	 *  그러나 문장이 끝이 나서도 +1이 남아있다면 그것은 닫혀야 할 것이 닫히지 않았단 뜻이다.
	 *  
	 */                      
	                         
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("괄호가 포함된 문자열을 제출하세요");
	String input = sc.next(); //문자열을 입력받아 저장해주자.
	if(input.length()>30) {
		System.out.println("문자열의 길이가 30개 이상을 초과하면 안됩니다");
		System.out.println("괄호가 포함된 문자열을 제출하세요");
		input = sc.next(); //문자열을 입력받아 저장해주자.
	}
	int count = 0;
	
	// 먼저 들어가기 전에 String의 메서드의 대해서 정리하고 가자.(여기선 예시로 input이 쓰인다)
	// String input = "Hello world!";
	// input.length(); -> 문자열의 길이를 뽑아준다. 따라서 12이다. 
	// input.charAt(4); -> 지정한 숫자의 위치에 있는 문자를 char 형태로 하나 뽑아준다.따라서 o이다.
	// input.indexof("java"); ->지정한 문자열이 어디에서부터 시작되는지 알려준다.없으면 -1을 반환.따라서 6.
	// input.contains("zz"); ->지정한 특정 단어가 포함되어져있는지 확인한다.true,false로 반환한다.따라서 false.
		
	for(int i=0;i<input.length();i++) {
		
		char a = input.charAt(i);
		
		if(a=='('){
			count +=1;
		}else if(a==')'){
			count -=1; 
		}
		
		if(count<0) {
			System.out.println("no");
		}	
	}
	
	if(count==0) {
		System.out.println("yes"); 
	}else if(count>0) {
		System.out.println("no"); 
	}
	
	}		
}