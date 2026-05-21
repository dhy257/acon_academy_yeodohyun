package day5.enumEx3;

public class MonitorNewMain {

	public static void main(String[] args) {
		 
		
		MonitorNew monitor  = new MonitorNew( "와이드모니터" , Mode.DRARK , "삼성");
		MonitorNew monitor2  = new MonitorNew( "와이드모니터" , Mode.LIGHT , "LG");
		MonitorNew monitor3  = new MonitorNew( "와이드모니터" , Mode.LIGHT , "LG");
		 //MonitorNew monitor4  = new MonitorNew( "와이드모니터" , "YELLOW" , "LG");
				
		System.out.println(monitor);
		System.out.println(monitor2);
		System.out.println(monitor3);
						

	}

	

}
