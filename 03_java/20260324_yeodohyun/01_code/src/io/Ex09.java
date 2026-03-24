package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/acorn.txt"));

			while (true) {
				String data = bf.readLine();

				if (data == null)
					break;
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일 없음");
//			throw e;
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("파일 없음");
		} finally {
			System.out.println("ddd");
		}

	}

}
