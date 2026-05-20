package day4prac.실습;

public class 요리사2 implements Cook {

	@Override
	public void porkBulgogi() {
		System.out.println("길동: 돼지불백을 정성스럽게 만듭니다.");
	}

	@Override
	public void mixedWrapRice() {
		System.out.println("길동: 모둠쌈밥을 건강하게 만듭니다.");
	}

	@Override
	public void soybeanStew() {
		System.out.println("길동: 불고기된장찌개를 깊은 맛으로 만듭니다.");
	}
}