package day21.chatt.prac;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	// 서버 소켓 필요
	// 소켓 : 클라이언트와 통신할 소켓
	// 보조 스트림 : 기반으로부터 데이터 가공을 편리하게 해줌
	// => 보조스트림 in :
	// => 보조스트림 out :
	// 스캐너

	ServerSocket serverSocket;
	Socket socket;
	DataInputStream is;
	DataOutputStream os;
	Scanner sc = new Scanner(System.in);

	public Server1() {
		try {
			// 6500포트로 열림
			serverSocket = new ServerSocket(6500);
			System.out.println("기다리는 중");
			socket = serverSocket.accept();
			//
			System.out.println("client :" + socket.getInetAddress().toString());

			is = new DataInputStream(socket.getInputStream());
			os = new DataOutputStream(socket.getOutputStream());

			받기();

			보내기();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void 보내기() {
		// TODO Auto-generated method stub
		System.out.println("서버 쪽에서 보내는 답변:");
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
		new Server1();
	}

}
