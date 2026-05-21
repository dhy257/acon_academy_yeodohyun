package day5prac.애너테이션;

public class Customer {
	@MaxLen(length = 14)
	String tel;

	public Customer(String tel) {
		super();
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Customer [tel=" + tel + "]";
	}

}
