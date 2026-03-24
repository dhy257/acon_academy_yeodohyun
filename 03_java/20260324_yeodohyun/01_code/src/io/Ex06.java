package io;

import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fis = new FileReader("res/acorn.txt");
		int data = fis.read();
		System.out.println((char) data);

		data = fis.read();
		System.out.println((char) data);

		data = fis.read();
		System.out.println((char) data);
		fis.close();
	}

}
