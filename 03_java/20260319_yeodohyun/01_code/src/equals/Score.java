package equals;

public class Score {
	String name;
	int kor;
	int eng;

	public Score() {

	}

	public Score(String name, int kor, int eng) {
//		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	// equals 오버라이드 하기
	// 이런 라이브러리는 대부분 Object 타입을 대상으로 함
	public boolean equals(Object obj) { // 업캐스팅 되어 있음 => 성적정보 알 수 있음
		boolean result = false;

		// instanceof 로 확인하기 - 다운캐스팅
		Score other = (Score) obj;
		if (this.kor == other.kor && this.eng == other.eng) {
			return true;
		}
		return result;
	}
}