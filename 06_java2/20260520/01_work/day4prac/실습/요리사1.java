package day4prac.실습;

public class 요리사1 implements Cook {

	@Override
	public void porkBulgogi() {
		System.out.println("길순: 매콤한 스타일 돼지불백!");
	}

	@Override
	public void mixedWrapRice() {
		System.out.println("길순: 고소한 모둠쌈밥!");
	}

	@Override
	public void soybeanStew() {
		System.out.println("길순: 얼큰한 된장찌개!");
	}
}