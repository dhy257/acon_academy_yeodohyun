package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 보조스트림은 반드시 기반스트림을 필요로 한다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println(line);

		String su = br.readLine(); // "123" => 123
		int suu = Integer.parseInt(su);
		System.out.println(suu);

		// .nextInt(), nextDouble() nextLine() ... => Scanner => 보조스트림
	}

}
