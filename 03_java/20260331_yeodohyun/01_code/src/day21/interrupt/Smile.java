package day21.interrupt;

public class Smile extends Thread {

    
	//인터럽트:false
	//인터럽트:true :인터럽트가 들어오면 참이됨
	
	@Override
    public void run() {
        while (!isInterrupted()) {   // 인터럽트 상태 체크
            System.out.println("^__^");
        }
        System.out.println("스레드 종료");
    }
	
}