package javaprj.day14.신나는인터페이스;

class MyUtil정철진 {

    public void printStars() {
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
    }

    public void printChars(String str) {
        for (int i = 0; i < 3; i++) {
            System.out.print(str);
        }
    }

    public void runCode(Runnable code) {
        for(int i=0; i<3; i++) {
        	code.run();
        }
    }
    
    /*Runnable을 사용하지 않을경우 기능 똑같이 만들어 주는 방법*/
    @FunctionalInterface
    public interface MyTask {
        // Runnable의 run()과 같은 역할
        void execute(); 
    }
    
    public void runNow(MyTask task) {
        System.out.println("--- 작업을 시작합니다 ---");
        
        for(int i=0; i<3; i++) {
        	task.execute(); // 전달받은 로직 실행
        }
        
        System.out.println("--- 작업이 종료되었습니다 ---");
    }
    
    
    public static void main(String[] args) {
		MyUtil정철진 myUtil = new MyUtil정철진();
		
		myUtil.printStars(); //별찍기
		
		System.out.println();
		
		myUtil.printChars("hello"); //문자열 찍어주기
		
		System.out.println();
		
		myUtil.runCode(new Runnable() { 
			@Override
			public void run() {
				System.out.println("원하는 코드 실행");
			}
		});
		
		
		myUtil.runNow(() -> System.out.println("람다식 실행"));
	}
}
