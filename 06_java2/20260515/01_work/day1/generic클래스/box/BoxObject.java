package day1.generic클래스.box;

public class BoxObject {
	
	Object[ ] list  = new Object[10];
	int index=0;
	
	
	
	//add
	
	public void add ( Object item) {
		list[index]  =item;
		index++;
	}
	
	
	//get
	
	
	public Object get( int i) {
		return list[i];
	}
	
	
	//size
	

	public int size() {
		return index;
	}
	
	

}
