package day16.exception.checked;

import java.io.IOException;

public class 실습Ex02 {
	
	//main -> jvm이 호출함  (자바가상머신)
 
	
	/*
	 *  checked 예외 처리하는 방법 
	 *  
	 *  예외 미루기,  throws 사용하기
	 */
	public static void main(String[] args) throws IOException {  // 예외를 처리하지 않은 경우와 동일해짐 
		  
		int ch  = System.in.read();
		System.out.println( (char) ch);
		 

	}

}
