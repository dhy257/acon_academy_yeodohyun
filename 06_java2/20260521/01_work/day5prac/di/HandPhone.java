package day5prac.di;

public class HandPhone {
	Battery battery; // 의존성

	// 생성자, Setter

	// Setter 주입
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	//
	public void power() {
		System.out.println("에너지 얻어오기");
		int energy = battery.getEnergy();
		if (energy > 0)
			System.out.println("전원 ON");
	}

}
