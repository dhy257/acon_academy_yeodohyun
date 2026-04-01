package day21.chatt.prac;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	Socket socket;
	DataInputStream is;
	DataOutputStream os;
	Scanner sc = new Scanner(System.in);

	public Client1() {
		try {
			socket = new Socket("localhost", 6500);

			is = new DataInputStream(socket.getInputStream());
			os = new DataOutputStream(socket.getOutputStream());

			보내기();

			받기();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void 보내기() {
		// TODO Auto-generated method stub
		System.out.println("클라이언트 쪽에서 보내는 답변:");
		String message = sc.nextLine();
		try {
			os.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void 받기() {
		// TODO Auto-generated method stub
		try {
			String message = is.readUTF();
			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client1();
	}

}
