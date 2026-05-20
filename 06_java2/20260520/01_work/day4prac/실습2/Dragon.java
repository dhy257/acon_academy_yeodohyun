package day4prac.실습2;

public class Dragon implements Enemy {

	@Override
	public void appear() {
		System.out.println("인카운터 : 드래곤 등장!");
	}

	@Override
	public void attack() {
		System.out.println("드래곤의 화염 브레스!");
	}
}