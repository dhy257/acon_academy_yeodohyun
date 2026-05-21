package day5prac.di;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhone h = new HandPhone();
		// Battery 주입 필요
		// HandPhone에서 Setter로 주입
		h.setBattery(new SMBattery());
//		h.setBattery(new LGBattery());

		h.power();
	}

}
