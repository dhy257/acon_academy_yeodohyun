package day4prac.실습2;

public class Orc implements Enemy {

    @Override
    public void appear() {
        System.out.println("인카운터 : 오크 등장!");
    }

    @Override
    public void attack() {
        System.out.println("오크의 강력한 도끼 공격!");
    }
}