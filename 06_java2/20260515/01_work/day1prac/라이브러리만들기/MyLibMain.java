package day1prac.라이브러리만들기;

public class MyLibMain {
	public static void main(String[] args) {
		MyLib lib = new MyLib();
		
		lib.printChar("k");
		lib.printStar();
		
		lib.codeRun(new CodeRunnableImp());
		
		lib.codeRun(new CodeRunnable() {
			
			@Override
			public void codeRun() {
				// TODO Auto-generated method stub
				System.out.println("한화이글스");
			}
		});
		
		
		lib.codeRun(new B());
		
		
	}
}
