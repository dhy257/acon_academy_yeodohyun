package day4prac.실습2;

public class Bow implements Weapon {

	@Override
	public void attack() {
		System.out.println("평타 : 활로 원거리 공격!");
	}

	@Override
	public void skill() {
		System.out.println("스킬 : 연속 화살 발사!");
	}

	private void medicalHeal() {
		System.out.println("히든 스킬 : 집중력 회복!");
	}
}