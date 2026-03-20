package 객체관계hasA포함;

// 자동차가 부품을 가진다
// 헬수장이 회원을 가진다
public class 자동차 {
	타이어 tire;

	public 자동차() { // 강한결합
		this.tire = new 타이어();
	}

//	public 자동차(타이어 tire) { // 약한결합
//		this.tire = tire;
//	}

	public void 전진한다() {
		System.out.println("코드실행");
		tire.굴러간다();
	}
}
