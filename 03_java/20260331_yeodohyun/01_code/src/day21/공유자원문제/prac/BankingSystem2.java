package day21.공유자원문제.prac;

import java.util.Random;

class BankAccount {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public synchronized void withdraw(String name, int amount) {
		System.out.println("[" + name + "] 출금 시도: " + amount + "원 (잔액: " + balance + "원)");

		if (balance >= amount) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance -= amount;
			System.out.println(">> [" + name + "] 출금 완료! (잔액: " + balance + "원)");
		} else {
			System.out.println(">> [" + name + "] 출금 실패: 잔액 부족");
		}
	}

	public synchronized void deposit(String name, int amount) {
		System.out.println("[" + name + "] 입금 시도: " + amount + "원 (잔액: " + balance + "원)");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		balance += amount;
		System.out.println(">> [" + name + "] 입금 완료! (잔액: " + balance + "원)");
	}
}

class User extends Thread {
	private BankAccount account;
	private String name;
	private Random random = new Random();

	public User(BankAccount account, String name) {
		this.account = account;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) { // 5번 시도
			int amount = random.nextInt(400) + 100; // 100~500원 랜덤
			boolean doDeposit = random.nextBoolean(); // true: 입금, false: 출금

			if (doDeposit) {
				account.deposit(name, amount);
			} else {
				account.withdraw(name, amount);
			}

			try {
				Thread.sleep(random.nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("--- " + name + " 업무 종료 ---");
	}
}

public class BankingSystem2 {
	public static void main(String[] args) {
		BankAccount jointAccount = new BankAccount();

		User user1 = new User(jointAccount, "철수");
		User user2 = new User(jointAccount, "영희");

		System.out.println("=== 공동 계좌 랜덤 거래 시작 (초기 잔액: 1000원) ===");

		user1.start();
		user2.start();

		try {
			user1.join();
			user2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("=== 거래 종료 ===");
		System.out.println("최종 잔액: " + jointAccount.getBalance() + "원");
	}
}