package day1.generic클래스.printer;

public class ThreeDPrinterPowder {
	
	private Powder material;

	public void setMaterial(Powder material) {
		this.material = material;
	}

	public Powder getMaterial() {
		return material;
	}
	
	public void print() {
		 System.out.println( "3D print use:" + material);
	 }
	 

}
