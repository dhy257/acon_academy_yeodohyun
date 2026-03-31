package day21.학생멀티쓰레드.윤현기;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    // Set타입 printWriter(out)으로 지정
    // Set인터페이스 , HashSet구현체
    private static Set<PrintWriter> clients = new HashSet<>();
    
    public static void main(String[] args) {
        System.out.println("채팅 서버가 시작되었습니다...");

        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            while (true) {
                // 유저가 접속 하면 소켓(서버)에 바로 접속(승인)
                new Client(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.out.println("서버 에러: " + e.getMessage());
        }
    }

    // 채팅에 참여하는 유저에 관한 쓰레드
    private static class Client extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        
        public Client(Socket socket) {
            this.socket = socket;
        }
        
        public void run() {
            try {
                // 소켓(서버)에도 버퍼,인풋스트림 in,out 설정
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // 유저추가
                // 동기화 하기(락을 건다고 생각하면 됨)
                // 유저가 접속 할 때 다른 쓰레드들의 충돌을 막기위해
                synchronized (clients) {
                    clients.add(out);
                } // 동기화 세미콜론
                
                // 유저로부터 메시지 수신
                String message;
                // 메세지창의 값이 비어있지 않은 경우 출력
                while ((message = in.readLine()) != null) {
                    System.out.println("수신된 메시지: " + message);
                    broadcast(message);
                }
            } catch (IOException e) {
                System.out.println("유저 입출력 에러: " + e.getMessage());
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {}
                
                // synchronized(동기화)
                // 유저가 나갈 때 나머지 쓰레드들의 충돌을 막기 위함
                synchronized (clients) {
                    clients.remove(out);
                } // 동기화 세미콜론
            }
        }
        
        // 모든 유저에게 메시지 전송
        private void broadcast(String message) {
            // 동기화
            // 메세지 보낼 떄 다른 쓰레드들과 충돌을 막기 위함
            synchronized (clients) {
                for (PrintWriter client : clients) {
                    client.println(message);
                }
            } // 동기화 세미콜론
        }
    }
} 