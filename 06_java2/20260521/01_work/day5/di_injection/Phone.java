package day5.di_injection;

public class Phone {
	
	
	//dependency   의존성	 , 사용한다  => 의존한다.  
	Bettery bettery;
    // Bettery bettery  = new LGBettery();
	
	//생성자 주입 
	//setter 주입
	public void setBettery(Bettery bettery) {
		this.bettery = bettery;
	}
	
	
	
	
	public void powerOn() {		
		
		//에너지얻어오기
		bettery.getEnergy();
		
		System.out.println("파워가 켜집니다");
		System.out.println("<<메뉴>>");
		System.out.println("1.전화걸기, 2.메세지보내기");
	}
	
	
	
	//생성자 주입	
	public Phone(Bettery bettery) {
		super();
		this.bettery = bettery;
	}
	

	public Phone() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		
		//setter주입(Injection) 을 사용해서  Phone 객체를 실행 
		Phone phone = new Phone();		
		//폰에 베터리를 주입하는 코드		 
		phone.setBettery( new LGBettery());		
		phone.powerOn();
		
		
		//생성자 주입  
		Phone  phone2  = new Phone( new SMBettery());
		phone2.powerOn(); 
		
		
	}
	
	
	// 변경에 유리한 코드를 작성하는 기법 
	//  
	

}
