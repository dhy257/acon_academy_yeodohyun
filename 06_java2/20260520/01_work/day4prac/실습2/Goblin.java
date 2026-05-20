package day4prac.실습2;

public class Goblin implements Enemy {

	@Override
	public void appear() {
		System.out.println("인카운터 : 고블린 등장!");
	}

	@Override
	public void attack() {
		System.out.println("고블린이 몽둥이 공격!");
	}
}