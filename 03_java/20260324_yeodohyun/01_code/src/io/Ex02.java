package io;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("앞파벳 여러개 쓰고 엔터");

		int input;
		while ((input = System.in.read()) != '\n') {
			System.out.print((char) input);

		}

	}

}