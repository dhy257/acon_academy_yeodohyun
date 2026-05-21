package day5.enumEx3;

public class Monitor {
	
	String name;
	String mode;   //  DARK, LIGHT
	String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Monitor [name=" + name + ", mode=" + mode + ", brand=" + brand + "]";
	}
	public Monitor(String name, String mode, String brand) {
		super();
		this.name = name;
		this.mode = mode;
		this.brand = brand;
	}

	public Monitor() {
		// TODO Auto-generated constructor stub
	}
	
}
