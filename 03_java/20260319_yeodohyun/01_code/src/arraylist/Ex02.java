package arraylist;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Score> list = new ArrayList<>();
		list.add(new Score("김민경", 100, 100)); // Object 로 저장
		list.add(new Score("송주창", 90, 90));
		list.add(new Score("정철진", 80, 90));
		list.add(new Score("김재민", 100, 90));

		for (int i = 0; i < list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score);
			score.printInfo();
		}
	}

}
