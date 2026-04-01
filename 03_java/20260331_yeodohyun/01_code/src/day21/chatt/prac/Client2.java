package day21.chatt.prac;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	Socket socket;
	DataInputStream is;
	DataOutputStream os;
	Scanner sc = new Scanner(System.in);

	public Client2() {
		try {
			socket = new Socket("192.168.100.104", 6600);

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

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					while (true) {
						System.out.println("클라이언트 쪽에서 보내는 답변:");
						String message = sc.nextLine();
						os.writeUTF(message);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		th.start();
	}

	private void 받기() {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				try {

					while (true) {
						String message = is.readUTF();
						System.out.println("서버:" + message);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client2();
	}

}
