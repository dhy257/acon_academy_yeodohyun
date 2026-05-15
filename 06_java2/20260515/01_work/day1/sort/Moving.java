package day1.sort;


public class Moving  implements Comparable{
	String name;
	String code;
	int power;
	
	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
		this.power = power;
	}
	
	public Moving() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Moving m  = (Moving) o;
		return this.power - m.power;  //기준과  비교대상  교환할지 여부를  양수가 전달  =>  기준과 비교대상이 자리바꿈이 일어난다.
	} 
	
}