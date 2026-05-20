package day4prac.정철진여도현실습;

public class Bow implements Weapon {
	@Override
	public void attack() {
		System.out.println("활을 쏘아 공격합니다!");
	}

	private void skill() {
		System.out.println("[스킬발동]더블샷!");
	}

	private void medicalHeal() {
		System.out.println("히든 스킬 : 집중력 회복!");
	}
}
