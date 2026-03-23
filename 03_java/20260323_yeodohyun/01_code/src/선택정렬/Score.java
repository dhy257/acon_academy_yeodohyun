package 선택정렬;

public class Score implements Comparable {

	String name;
	int kor;
	int eng;

	// 생성자
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	@Override
	public int compareTo(Object o) { // 객체자신과 비교객체 => 어떤 기준으로 정렬할지 알려줘야함
		// 비교할 속성 선택하고 그 결과가 양수가 반환되면 => 기준이 크면 => 두 개의 요소의 자리를 바꿈
		// 음수가 반환되면 => 자리 안바꿈
		// 오름차순을 하고 싶으면 기준이 큰 경우에 양수가 전달되도록 하기
		// TODO Auto-generated method stub
		Score s = (Score) o;
		return this.kor - s.kor; // 기준이 크면 양수가 자연스럽게 전달된다
	}

}
