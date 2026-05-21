package day5.stack_queue;
import java.util.*;

public class 유효한괄호문제_스택 {
	public static void main(String[] args) {
		
		
		//
	     if(args.length!=1){
               System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
               System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");		  
			   System.exit(0);			
	     }
	     
		
	    // 
	    //프로그램 실행시 매개변수로 값을 전달 할 수 있다.	     
		Stack st = new Stack();
		String expression = args[0];		
		System.out.println("expression:"+expression);

		try {
			for(int i=0; i < expression.length();i++){    //  ((3+2))  // char[] 
				char ch = expression.charAt(i);    // charAt(0)
				
				if(ch=='('){
					st.push(ch);
				} else if(ch==')') {
					st.pop();
				}
			}
						
			if(st.isEmpty()){    //  비어있느냐?   짝이 맞음
				System.out.println("괄호가 일치합니다.");
			} else {            //  남아 있다면  짝이 맞지 않음 
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");		
		} // try
		
		
	}
}
