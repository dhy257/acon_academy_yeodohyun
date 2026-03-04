import java.util.Scanner;
import java.util.Stack;

public class 스택큐1 {	
	    public String solution(String str){
	        // 1. 문자열 최대 길이 30 제한
	        if (str.length() > 30) return "NO"; 

	        String answer = "YES";
	        Stack<Character> stack = new Stack<>();
	        
	        for(char x : str.toCharArray()){
	            if(x == '(') {
	                stack.push(x);
	            } else {
	                // 닫는 괄호가 나왔는데 뺄 여는 괄호가 없는 경우
	                if(stack.isEmpty()) return "NO"; 
	                stack.pop();
	            }
	        }
	        
	        // 모든 과정을 마쳤는데 여는 괄호가 남아있는 경우
	        if(!stack.isEmpty()) return "NO";
	        
	        return answer;
	    }

	    public static void main(String[] args){
	    	스택큐1 T = new 스택큐1();
	        Scanner kb = new Scanner(System.in);
	        
	        // 사용자로부터 문자열 입력
	        String str = kb.next();
	        System.out.println(T.solution(str));
	    }
	}

