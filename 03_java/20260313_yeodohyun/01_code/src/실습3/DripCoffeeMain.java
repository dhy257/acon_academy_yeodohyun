package 실습3;

public class DripCoffeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DripCoffee coffee = new DripCoffee();

		coffee.selectBean();
		coffee.selectBeanAmount();
		coffee.selectGrindSize();
		coffee.selectDripper();
		coffee.selectFilter();
		coffee.selectWaterTemp();

		coffee.startDrip();
		coffee.bypassWater();

		coffee.printResult();
	}

}
