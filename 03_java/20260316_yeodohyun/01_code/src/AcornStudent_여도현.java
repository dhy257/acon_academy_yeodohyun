
// AcornStudent s = new AcornStudent(); >> 변수 만들기, 객체 생성
public class AcornStudent_여도현 { // 에이콘학생정보를 저장하기 위한 자료형 만들기
	// 캡슐화
	// 데이터+매서드(함수) 묶음
	// 매서드가 하는 역할이 데이터를 사용한다(데이터변경하거나 단순히 읽기)

	// 속성
	private String name;
	private int 에너지;
	private int 근육량;
	private int 자바능력;
	private int 프론트능력;
	private double 시력;

	// 기능(매서드, 함수)
	// 매서드를 통해서 변수 사용

	// 입력하기(기본)
	public void 입력하기(String name, int 근육량, int 에너지, int 자바능력, int 프론트능력, double 시력) {
		this.name = name;
		this.근육량 = 근육량;
		this.에너지 = 에너지;
		this.자바능력 = 자바능력;
		this.프론트능력 = 프론트능력;
		this.시력 = 시력;
	}

	// 출력하기(기본)
	// static이 아닌 매서드는 객체에서도(인스턴스에서도), 객체와 정보를 전달받는다, this라는 키워드

	public void 정보출력하기() {
		System.out.println("===================");
		System.out.println("name: " + name);
		System.out.println("근육량: " + 근육량);
		System.out.println("에너지: " + 에너지);
		System.out.println("자바능력: " + 자바능력);
		System.out.println("프론트능력: " + 프론트능력);
		System.out.println("시력: " + 시력);
	}

	public void 배열공부하기() {
		자바능력 += 20;
		에너지 -= 5;
		시력 -= 2.0;

	}

	public void div로풋터만들기() {
		프론트능력 += 30;
		에너지 -= 5;
		시력 -= 2.0;
	}

	public void 밥먹기() {
		에너지 += 100;
	}

	public int 웃는다() {
		에너지 += 10;
		return 10;
	}

	public void 눈스트레칭() {
		시력 += 0.5;
	}

	public void 시력체크() {
		if (시력 < 0.5) {
			System.out.println("시력이 너무 낮습니다. 눈 스트레칭을 하세요!");
		} else {
			System.out.println("시력 상태가 괜찮습니다.");
		}
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		AcornStudent_여도현 s = new AcornStudent_여도현();
//
//		s.입력하기("여도현", 80, 60, 70, 50, 20);
//		s.시력체크();
//		s.배열공부하기();
//		s.정보출력하기();
//	}
}
