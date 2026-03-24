package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new FileReader("res/acorn.txt"));

		String data = bf.readLine();
		System.out.println(data);
		data = bf.readLine();
		System.out.println(data);
		data = bf.readLine();
		System.out.println(data);
	}

}
