package day4prac.정철진여도현실습;

public class Sword implements Weapon {
	@Override
	public void attack() {
		System.out.println("장검을 휘둘러 공격합니다!");
	}

	private void skill() {
		System.out.println("[스킬발동]2연격!");
	}
}
