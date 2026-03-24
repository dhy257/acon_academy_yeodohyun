package io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 한 문자씩 읽음 >> 한글 가능
		InputStreamReader ir = new InputStreamReader(System.in);
		int input = ir.read();
		System.out.println((char) input);
	}

}
