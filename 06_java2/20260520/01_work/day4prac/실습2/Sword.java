package day4prac.실습2;

public class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("평타 : 검으로 강하게 베기");
	}

	@Override
	public void skill() {
		System.out.println("스킬 : 회전 베기");
	}

	// Reflection으로 강제 호출할 private 메서드
	private void medicalHeal() {
		System.out.println("히든 스킬 : 체력 회복!");
	}
}