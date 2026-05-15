package day1.generic클래스.printer;

public class ThreeDPrintTtest {

	public static void main(String[] args) {
		 
		ThreeDPrinterPlastic  p  = new ThreeDPrinterPlastic();
		p.setMaterial(new Plastic());
		p.print();
		
		
		
		
		ThreeDPrinterPowder p2 = new ThreeDPrinterPowder ();
		p2.setMaterial(new Powder());
		p2.print();
		
				
		GThreeDPrinter<  Plastic> p3= new GThreeDPrinter<>();
		p3.setMaterial(new Plastic());
		p3.print();
		
		
		GThreeDPrinter<Powder> p4= new GThreeDPrinter<>();
		p4.setMaterial(new Powder());
		p4.print();
		
		
		GThreeDPrinter<Water> p5= new GThreeDPrinter<>();
		p5.setMaterial(new Water());
		p5.print();
		
		
		GThreeDPrinter2<Plastic> p6= new GThreeDPrinter2<>();
		p6.setMaterial(new Plastic());
		p6.print();
		
		GThreeDPrinter2<Powder> p7 = new GThreeDPrinter2<>();
		p7.setMaterial(new Powder());
		p7.print();
		
		//GThreeDPrinter2<Water> p8= new GThreeDPrinter2<>();
		
		 		
		
		
	}

}
