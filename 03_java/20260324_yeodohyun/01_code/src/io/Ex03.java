package io;

import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input; // 키보드에 asdfa엔터 >> 엔터 아닐 때까지 읽음
		try {
			while ((input = System.in.read()) != '\n') {
				System.out.println((char) input);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
