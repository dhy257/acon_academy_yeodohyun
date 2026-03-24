package io;

import java.io.FileReader;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fis = new FileReader("res/acorn.txt");
		while (true) {
			int data = fis.read();

			if (data == -1) { // 아스키코드값이 -1이면 우리가 사용하지 않는다고 판단
				break;
			}
			System.out.print((char) data);

		}
	}

}
