package 실습2;

public class Item {

	private String name; // 아이템 이름
	private int level; // 강화 단계
	private int maxLevel; // 최대 강화

	// 생성자
	public Item(String name, int level, int maxLevel) {
		this.name = name;
		this.level = level;
		this.maxLevel = maxLevel;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	// 강화 성공 시 레벨 증가
	public void levelUp() {
		level++;
	}
}
