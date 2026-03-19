package arraylist;

public class GMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// generic은 컴파일타임에 타입을 체크해준다.

		GList<Score> list = new GList<>();
		list.add(new Score("박세인", 90, 99));
		list.add(new Score("여도현", 80, 89));
		list.add(new Score("이용찬", 91, 100));

		for (int i = 0; i < list.size(); i++) {
			Score o = list.get(i);
			o.printInfo();
		}
	}

}
