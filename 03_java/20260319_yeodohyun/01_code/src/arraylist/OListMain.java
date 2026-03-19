package arraylist;

public class OListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OList list = new OList();
		list.add(new Score("박세인", 90, 99));
		list.add(new Score("여도현", 80, 89));
		list.add(new Score("이용찬", 91, 100));

		for (int i = 0; i < list.size(); i++) {
			Object o = list.get(i);
			System.out.println(o);
			// Score 객체의 고유 매서드를 쓰고 싶으면 다운캐스팅 필수
			((Score) o).printInfo();
		}
	}

}
