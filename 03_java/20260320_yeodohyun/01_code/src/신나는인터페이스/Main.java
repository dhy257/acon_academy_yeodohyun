package 신나는인터페이스;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> list = new ArrayList<>();

		list.add(new 여도현());
		list.add(new 김태준());
		list.add(new 김민경());
		list.add(new 박세인());
		list.add(new 송주창());
		list.add(new 엄진희());
		list.add(new 이용찬());
		list.add(new 이정하());
		list.add(new 이현겸());
		list.add(new 정철진());
		list.add(new 황스일());

		ArrayList<나는게가능한> 나는그룹 = new ArrayList<>();
		ArrayList<많이먹는게가능한> 많이먹는그룹 = new ArrayList<>();
		ArrayList<변신가능한> 변신그룹 = new ArrayList<>();
		ArrayList<불어가능한> 불어그룹 = new ArrayList<>();
		ArrayList<싸움이가능한17대1> 싸움그룹 = new ArrayList<>();
		ArrayList<장풍이가능한> 장풍그룹 = new ArrayList<>();
		ArrayList<태권도가가능한> 태권도그룹 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {

			Object o = list.get(i);

			if (o instanceof 나는게가능한) {
				나는그룹.add((나는게가능한) o);
			}

			if (o instanceof 많이먹는게가능한) {
				많이먹는그룹.add((많이먹는게가능한) o);
			}

			if (o instanceof 변신가능한) {
				변신그룹.add((변신가능한) o);
			}

			if (o instanceof 불어가능한) {
				불어그룹.add((불어가능한) o);
			}

			if (o instanceof 싸움이가능한17대1) {
				싸움그룹.add((싸움이가능한17대1) o);
			}

			if (o instanceof 장풍이가능한) {
				장풍그룹.add((장풍이가능한) o);
			}

			if (o instanceof 태권도가가능한) {
				태권도그룹.add((태권도가가능한) o);
			}

		}

		// 많이 먹는 애들에게 먹방유튜브 시키기

		// 많이 먹어라는 일관된 명령 주기

		// 각 객체의 고유 동작 실행

		for (int i = 0; i < 많이먹는그룹.size(); i++) {
			많이먹는그룹.get(i).많이먹다();
		}
	}

}
