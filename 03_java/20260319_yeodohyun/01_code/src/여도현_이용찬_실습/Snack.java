package 여도현_이용찬_실습;

public class Snack extends Food {

	private int weight;

	public Snack() {
	}

	public Snack(String name, int price, int num, int exp, int weight) {
		super(name, price, num, exp);
		this.weight = weight;
	}

	@Override
	public void spoil() {
		if (getExp() < 3) {
			System.out.println("곧 상합니다.");
		} else {
			System.out.println("잘 부패하지 않습니다.");
		}
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("용량: " + weight);
		spoil();

	}

}
