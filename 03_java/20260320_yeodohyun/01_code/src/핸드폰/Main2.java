package 핸드폰;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhone phone = new HandPhone();

		// 핸드폰에 배터리 주입(injection)
//		phone.setBattery(new SMBattery());
//		phone.setBattery(new LGBattery());

		// 1. Battery 인터페이스를 이름있는 클래스로 구현해서 사용해보기
		phone.setBattery(new AppleBattery());
		// 2. Battery 인터페이스를 익명클래스로 구현해서 사용해보기
//		phone.setBattery(new Battery() {});s
//		phone.setBattery(new Battery() {
//
//			@Override
//			public void getEnergy() {
//				// TODO Auto-generated method stub
//				System.out.println("xiaomi배터리 에너지 얻어온다");
//			}
//		});

		phone.powerOn();
	}

}
