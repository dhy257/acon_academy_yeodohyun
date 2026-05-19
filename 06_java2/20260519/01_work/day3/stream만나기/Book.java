package day3.stream만나기;

public class Book {
	
	String name;
	int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	} 

	public Book() {
		// TODO Auto-generated constructor stub
	}
}
