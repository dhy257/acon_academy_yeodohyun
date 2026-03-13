// 자파니
// 데이터 + 데이터 사용하는 함수 => 설계, 명세
public class 자판기 {

	int 설탕 = 1000;
	int 프리마 = 1000;
	int 원두 = 1000;
	int 물 = 10000;
	int 매출금액 = 0;

	// 변수(객체)를 다루는 매서드 정의

	// 입력
	// 출력
	// 밀크커피 만들기
	// 원두커피 만들기
	// 커피 채우기

//	public void c입력하기() {
//	
//	}

	public void printCurrentCoffee() {
		System.out.println("<<현재커피 정보 출력>>");
		System.out.println("매출금액:"+매출금액);
		System.out.println("물"+물);
		System.out.println("설탕"+설탕);
		System.out.println("원두"+원두);
		System.out.println("프리마"+프리마);
	}

	public String milkCoffee(int money) {
		System.out.println("밀크커피 만듬");
		this.설탕 -= 10;
		this.프리마 -= 20;
		this.원두 -= 10;
		this.물 -= 100;
		this.매출금액 += money;
		return "밀크커피";
	}

	public void fill() {
		물 += 1000;
		원두 += 100;
		설탕 += 100;
		프리마 += 100;
	}
}
