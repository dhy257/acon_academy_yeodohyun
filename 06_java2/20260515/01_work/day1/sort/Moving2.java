package day1.sort;


public class Moving2 implements Comparable<Moving2>  {
	String name;
	String code;
	int power;
	
	public Moving2(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}
	public Moving2() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}
	@Override
	public int compareTo(Moving2 o) {
		// TODO Auto-generated method stub
		return this.power -  o.power;
	}
 
	
	
}