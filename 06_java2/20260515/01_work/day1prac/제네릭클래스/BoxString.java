package day1prac.제네릭클래스;

public class BoxString {
	String[] list  = new String[10];
	int index=0;
	
	//add
	
	public void add( String i) {
		list[index] =i;
		index++;
	}
	
	
	//get
	
	public String get( int i) {
		return list[i];
	}
	
	
	
	//size
	
	public int size() {
		return index;
	}
}
