package day5.stack_queue;
import java.util.*;

public class 앞으로뒤로_스택사용 {
	
	public static Stack back    = new Stack();  
	public static Stack forward = new Stack();  
	
	
	// 브러우저의  이동, 뒤로, 앞으로 구현 
	//1. url 이동하기
	//    - 이동정보가  back 스택에 쌓인다. (가장 최신의 것이 맨 위에 있다)
	//    - forward 스택에 내용이 있다면 지운다 (앞으로 가기에 쌓인것 삭제하기)
	//2. 뒤로가기
	//   - back에서 꺼내서 forward에 넣기 	 
	//3. 앞으로가기
	//   - forward에서 꺼내서 back에 넣기

	public static void main(String[] args) {
		 goURL("1.네이트");   // 1.  네이트   2. 야후   3.네이버  4.다음 
		 goURL("2.야후");
		 goURL("3.네이버");
		 goURL("4.다음");  

		printStatus();

		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");  
		printStatus();

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");  
		printStatus();

		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");  
		printStatus();

		goURL("acorn.com");
		System.out.println("= 새로운 주소로 이동 후 =");  
		printStatus();
	}

	public static void printStatus() {
		
		if(back.isEmpty()) return;
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면은 '" + back.peek()+"' 입니다.");  
		System.out.println();
	}

	public static void goURL(String url){
		back.push(url);   // 스택에 저장하기 , 최근의 것이 맨위에 있다. (밑이 막힌 통   , 위로 쌓임)
		if(!forward.empty())    
			forward.clear();
	}

	public static void goForward(){    
		if(!forward.empty())            
			back.push(forward.pop());
	}

	public static void goBack(){    
		
		if(!back.empty())
			forward.push(back.pop());
	}
}
