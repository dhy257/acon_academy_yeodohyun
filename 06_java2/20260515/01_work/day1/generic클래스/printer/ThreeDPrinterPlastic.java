package day1.generic클래스.printer;


public class ThreeDPrinterPlastic {
	
	private Plastic material;

	public void setMaterial(Plastic material) {
		this.material = material;
	}

	public Plastic getMaterial() {
		return material;
	}
	
	public void print() {
		 System.out.println( "3D print use:" + material);
	}
	 

}
