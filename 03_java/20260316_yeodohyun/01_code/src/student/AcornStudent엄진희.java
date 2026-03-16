package student;

//  AcornStudent s  = new AcornStudent();   //  변수만들기 , 객체생성기

// 에이콘학생정보를 저장하기 위한  자료형 만들기 
//캡슐화 
//데이타+ 매서드(함수) 묶음
//매서드가 하는 역할이 데이터를 사용한다 ( 데이터변경하거나, 단순히 읽기)
public class AcornStudent엄진희 {

	// 속성
	private String name;
	private int 에너지;
	private int 근육량;
	private int 자바능력;
	private int 프론트능력;
	private int 체력;

	// 기능(매서드, 함수)
	// 매서드를 통해서 변수를 사용한다 (데이터를 사용하는 기능)

	// 입력하기 (기본)
	// 출력하기 (기본)

	// 배열공부하기

	public void 입력하기(String name, int 에너지, int 근육량, int 자바능력, int 프론트능력, int 체력) {
		this.name = name;
		this.에너지 = 에너지;
		this.근육량 = 근육량;
		this.자바능력 = 자바능력;
		this.프론트능력 = 프론트능력;
		this.체력 = 체력;
	}

	// 정보 출력하기
	public void 정보출력하기() {
		System.out.println();
		System.out.println("name" + name);
		System.out.println("에너지" + 에너지);
		System.out.println("근육량" + 근육량);
		System.out.println("자바능력" + 자바능력);
		System.out.println("프론트능력" + 프론트능력);
		System.out.println("체력" + 체력);
	}

	public void 배열공부하기() {
		자바능력 += 20;
		에너지 -= 5;

	}

	public void div로풋터만들기() {
		프론트능력 += 30;
		에너지 -= 5;
	}

	public void 밥먹기() {
		에너지 += 100;
	}

	public int 웃는다() {
		에너지 += 10;
		return 10;
	}

	public int 수면() { // static이 아닌 매서드는 객체에서도(인스턴스에서도), 객체와 정보를 전달받는다, this라는 키워드
		체력 += 5;
		return 10;
	}
	
	// static매서드란 단지 class엣 소속되어있는 매서드다
	// 이 매서드의 사용법은 class의 이름.매서드의 이름으로 사용할 수 있다.

}
