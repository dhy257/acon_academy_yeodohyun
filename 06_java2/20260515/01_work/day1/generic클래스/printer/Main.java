package day1.generic클래스.printer;

public class Main {

	public static void main(String[] args) {
		 
		
		ThreeDPrinterPlastic  t  = new ThreeDPrinterPlastic();
		t.setMaterial( new Plastic());
		t.print();
		
		
		
		ThreeDPrinterPowder t2 = new ThreeDPrinterPowder();
		t2.setMaterial(new Powder());
		t2.print();
		
		
		// 2개의 클래스  =>   제네릭  1개로 만듬  GThreeDPrinter
		
		
		GThreeDPrinter<Plastic> g = new GThreeDPrinter<>();
		g.setMaterial(new Plastic());
		g.print();
		
		
		GThreeDPrinter<Powder> g2 = new GThreeDPrinter<>();
		g2.setMaterial(new Powder());
		g2.print();
		
		//제네릭이란?
		// 여러참조 자료형이 쓰일 수 이쓴 곳에 특정 자료형을 지정하지 않고 
		// 클래스나 매서드를 정의한 후
		// 사용하는 시점에 어떤 자료형을 사용할 것인지 지정하는 방식 
		
		// 어떤변수가 여러참조형을 사용할 수 있도록   Object를 사용하면 
		// 다시 원래자료형으로 사용하기 위해서 형변환을 해줘야 한다 ( 형변환의 번거러움을 해결한다)
		// Object   -> 형변환 번거러움이 발생 
		
		
		
		

	}

}
