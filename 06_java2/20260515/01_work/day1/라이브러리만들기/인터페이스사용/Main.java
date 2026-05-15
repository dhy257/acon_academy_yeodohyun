package day1.라이브러리만들기.인터페이스사용;

public class Main {

	public static void main(String[] args) {
		MyLib lib = new MyLib();
		lib.codeRun(  new A() ); 
		lib.codeRun(  new B() ); 
		lib.codeRun(  new C() );

	}

}
