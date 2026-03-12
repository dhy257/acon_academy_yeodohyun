
public class 매개변수_배열문제 {

	// 기능: 이름배열에서 해당하는 성 씨 이름 수 반환
	// 입력: 이름 배열
	// 반환: 해당하는 이름 수
	public static int name(String[] names, String firstName) {
		int cnt = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith(firstName)) {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {
				//
				"김건희", "고지연", "김민정", "황스일", "이현겸", //
				"이용찬", "여도현", "장해든", "박세인", "나해수", //
				"손영석", "송주창", "정철진", "김재민", "엄진희", //
				"이정하", "김민경", "조아진", "장윤성", "김태준"//
		};

		System.out.println(name(names, "김"));

	}

}
