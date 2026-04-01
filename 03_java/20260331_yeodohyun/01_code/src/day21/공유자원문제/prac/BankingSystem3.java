package javaprj.day21.prac;

import java.util.Random;

class BankAccount {
	private int balance = 1000; // 통장 잔액 초기값은 1000원
	boolean isServiceOpen = true; // 은행 영업 중인지 플래그 false 되면 장사 끝

	public int getBalance() {
		return balance;
	}

	// synchronized(자물쇠)
	public synchronized void withdraw(String name, int amount) {
		//영업 종료됐으면 출금 시도 못 하게 막아버림
		if (!isServiceOpen) {
	        System.out.println("[" + name + "] 거래 실패: 이미 영업이 종료되었습니다.");
	        return;
	    }
		
		System.out.println("[" + name + "] 출금 시도: " + amount + "원 (현재 잔액: " + balance + "원)");

		// 돈은 없는데 은행은 영업 중이면 대기실 가서 기다려야 함
		// if가 아니라 while인 이유: 깨어났을 때 다시 조건을 확인해야함
		while (balance < amount && isServiceOpen) {
			System.out.println(">> [" + name + "] 출금 대기: 잔액이 부족합니다. (현재: " + balance + "원 / 요청: " + amount + "원)");
			try {
				//잠시 대기
				wait(); 
				// notifyAll() 받아서 깨어나면 여기서부터 다시 시작
				System.out.println(">> [" + name + "] 거래재개! 잔액을 다시 확인합니다.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// wait()에서 깨어났는데 은행 문이 닫혔고 돈도 없으면 거래 포기
		if (!isServiceOpen && balance < amount) {
            System.out.println(">> 은행 영업 종료 거래실패!");
            return; 
        }
		
		// 실제 출금 처리
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		balance -= amount; // 잔액 차감
		System.out.println(">> [" + name + "] 출금 완료! (남은 잔액: " + balance + "원)");
	}

	// 입금 메소드
	public synchronized void deposit(String name, int amount) {
		System.out.println("[" + name + "] 입금 시도: " + amount + "원 (현재 잔액: " + balance + "원)");

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		balance += amount; // 잔액 증가
		System.out.println(">> [" + name + "] 입금 완료! (새 잔액: " + balance + "원)");
		
		// 돈 들어왔으니까 대기중인 쓰레드 싹 다 깨워줌.
		notifyAll();
	}
	
	// 영업 종료 선언 메소드
	public synchronized void closeAccount() {
        this.isServiceOpen = false; // 플래그 끄기
        System.out.println("\n=== [시스템] 은행 영업 종료! ===");
        // 아직 대기중인 쓰레드가 있으면 깨워서 종료시키기 위해
        notifyAll();
    }
}


class User extends Thread {
	private BankAccount account; // 공용 통장
	private String name;
	private Random random;
	private boolean isDepositTask; // 입금할 사람인지 출금할 사람인지 결정하는 스위치

	public User(BankAccount account, String name, boolean isDepositTask) {
		this.account = account;
		this.name = name;
		this.isDepositTask = isDepositTask;
		this.random = new Random();
	}

	@Override
	public void run() {
		// 각 스레드는 총 3번의 업무를 수행
		for (int i = 0; i < 3; i++) {
			int amount = random.nextInt(500) + 100; // 100~599원 사이 랜덤 금액

			if (isDepositTask) {
				account.deposit(name, amount + 200); // 입금 업무 수행
			} else {
				account.withdraw(name, amount); // 출금 업무 수행
			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("--- " + name + " 업무 종료 ---");
	}
}


public class BankingSystem {
	public static void main(String[] args) {
		// 단 하나의 공유 계좌 생성
		BankAccount jointAccount = new BankAccount();
		
		// 3명의 스레드 생성 (철수와 영희는 출금, 엄마는 입금)
		User user1 = new User(jointAccount, "철수", false); // 출금자
		User user2 = new User(jointAccount, "영희", false); // 출금자
		User user3 = new User(jointAccount, "엄마", true);  // 입금자

		System.out.println("=== 공동 계좌 거래 시작 (초기 잔액: 1000원) ===");

		user1.start();
		user2.start();
		user3.start();
		
		try {
			//'엄마' 스레드가 입금 업무를 마칠 때까지 메인 스레드가 기다리기
            user3.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		// 엄마가 업무를 마쳤으므로 은행 영업을 종료
        // 이때 wait() 중인 다른 사용자들은 깨어나서 루프 종료
        jointAccount.closeAccount();
	}
}