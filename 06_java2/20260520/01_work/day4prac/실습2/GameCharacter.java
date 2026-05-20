package day4prac.실습2;

public class GameCharacter {

	private Weapon weapon;
	private String name;

	public GameCharacter(String name) {
		this.name = name;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void fight(Enemy enemy) {

		System.out.println("================================");
		System.out.println("⚔️ " + name + " 전투 시작!");
		System.out.println("================================");

		enemy.appear();

		System.out.println();

		weapon.attack();

		weapon.skill();

		System.out.println();

		enemy.attack();

		System.out.println();

		System.out.println("🏆 " + name + " 승리!");
		System.out.println("================================");
	}
}