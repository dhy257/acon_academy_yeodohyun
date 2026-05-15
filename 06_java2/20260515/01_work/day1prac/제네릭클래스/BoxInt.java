package day1prac.제네릭클래스;

public class BoxInt {
	
	Integer[] list  = new Integer[10];
	int index=0;
	
	//add
	
	public void add( Integer i) {
		list[index] =i;
		index++;
	}
	
	
	//get
	
	public Integer get( int i) {
		return list[i];
	}
	
	
	
	//size
	
	public int size() {
		return index;
	}

}
