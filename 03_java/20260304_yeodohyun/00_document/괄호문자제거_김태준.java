package pro260304;

import java.util.Scanner;

public class 괄호문자제거{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input ="";
		
		while(true) {
			
			System.out.println("괄호가 포함된 문자열을 제출해주세요(100자 제한)");
			input = sc.next();
			
			if(input.length() > 100) {
				System.out.println("문자열의 길이가 100자를 초과했습니다");
				input="";
			}else {
				break;
			}
		}
		
		System.out.println("입력되었습니다."+input);
		
		int count = 0;
		String answer = "";
		
		for(int i=0;i<input.length();i++) {
			
			char ch = input.charAt(i);
			
			if(ch == '(') {
				count += 1;
			}else if(ch ==')') {
				count -= 1;
				continue;
			}
			
			if(count == 0) {
				answer += ch;
			}
			
		}
		
		System.out.println(answer);
		
	}
}