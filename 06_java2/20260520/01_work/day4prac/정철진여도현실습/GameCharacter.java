package day4prac.정철진여도현실습;

public class GameCharacter {
    private String name;
    private Weapon weapon;

    public GameCharacter(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void doAttack() {
        if (weapon == null) {
            System.out.println(name + "(이)가 맨손으로 주먹을 휘두릅니다.");
            return;
        }
        System.out.print(name + "(이)가 무기를 사용합니다 -> ");
        weapon.attack();
    }
}