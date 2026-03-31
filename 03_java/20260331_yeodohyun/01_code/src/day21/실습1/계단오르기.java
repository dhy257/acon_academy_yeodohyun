package day21.실습1;

class 계단경주자 implements Runnable {
	private String name; // 참가자 이름
	private int move; // 한 번에 이동하는 계단 수 (1칸 or 2칸)

	// 생성자 초기화
	public 계단경주자(String name, int move) {
		this.name = name;
		this.move = move;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int position = 0; // 현재 위치 (시작은 0칸)

		// 30칸에 도달할 때까지 반복
		while (position < 30) {
			position += move; // 설정된 크기만큼 이동

			// 30칸 초과 하면 30으로 설정
			if (position > 30) {
				position = 30;
			}

			// 현재 위치
			System.out.println(name + ": " + position + "칸");

			try {
				// 보기 편하게 약간 지연 (1초는 너무 답답함..)
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// 30칸 도착 시 출력
		System.out.println(name + " 도착!===============================");
	}
}

public class 계단오르기 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new 계단경주자("1칸씩 이동하는 사람", 1));
		Thread t2 = new Thread(new 계단경주자("2칸씩 이동하는 사람", 2));

		t1.start();
		t2.start();

		try {
			t1.join(); // t1 끝날 때까지 대기
			t2.join(); // t2 끝날 때까지 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 스레드 다 끝나고 출력
		System.out.println("메인 종료");
	}
}