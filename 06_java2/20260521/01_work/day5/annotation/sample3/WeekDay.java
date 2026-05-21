package day5.annotation.sample3;


// enum
public enum WeekDay {
	
	//원하는 값으로 설정하려면 생성자를 이용해 줘야 한다 ( 멤버변수도 준비되어야 한다)
	MON("월") , THE("화") ,  WED("수") , THU("목") , FRI("금");	
	
	
	//멤버변수로 지정해야 한다
	String name;
	
	//매개변수 있는 생성자를 작성해야한다
	WeekDay( String name) {
	  	this.name  =name; 
	}
	String getName() {
		return name;
	}
	 
	
	//멤버변수 , 생성자_매개변수있는 ,  getter 필요
}
