package day3.stream.맛보기;

import java.util.Objects;

public class Book {
	String title;
	int price;
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	*/
	
	
	@Override   // 
	public boolean equals(Object obj) {
		boolean  flag=false;
		Book other  = (Book)obj;
		
		if(  this.title.equals(other.title)) {
			flag=true;
		}		
		
		return  flag;
	}
	
	
	
	

}
