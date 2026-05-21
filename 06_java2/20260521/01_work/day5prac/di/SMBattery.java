package day5prac.di;

public class SMBattery implements Battery {

	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		System.out.println("SM-Battery");
		return 100;
	}

}
