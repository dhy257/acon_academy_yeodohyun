package day5.di_injection;

public class SMBettery implements Bettery{

	@Override
	public int getEnergy() {
		// TODO Auto-generated method stub
		
		System.out.println("SM 밧데리 에너지 가져오기");
		return 2000;
	}

}
