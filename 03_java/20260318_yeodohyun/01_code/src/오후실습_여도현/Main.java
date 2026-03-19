package 오후실습_여도현;

public class Main {

	public static void main(String[] args) {

		// 업캐스팅
		Coffee[] coffees = new Coffee[3];
		coffees[0] = new DripCoffee("블랙 드립");
		coffees[1] = new Espresso("카페라떼");
		coffees[2] = new Coffee("일반커피");

		// 모두에게 make() 시키기 (다형성)
		makeAll(coffees);

		// 다운캐스팅해서 자식 메서드 실행
		// for each 안써도됨
		for (int i = 0; i < coffees.length; i++) {
		    Coffee c = coffees[i];

		    if (c instanceof DripCoffee) {
		        ((DripCoffee) c).addFilter();
		    } else if (c instanceof Espresso) {
		        ((Espresso) c).steamMilk();
		    }
		}

		// 잘못된 다운캐스팅 예제
		Coffee c = new Coffee("그냥커피");
		// Espresso e = (Espresso) c; // 런타임 에러
		if (c instanceof Espresso) {
			Espresso e = (Espresso) c;
			e.steamMilk();
		} else {
			System.out.println(c.getName() + "는 Espresso로 변환할 수 없습니다!");
		}
	}

	private static void makeAll(Coffee[] coffees) {
	    System.out.println("모든 커피를 만든다");
	    for (int i = 0; i < coffees.length; i++) {
	        Coffee c = coffees[i];
	        System.out.print(c.getName() + " ");
	        c.make();
	    }
	    System.out.println();
	}
}