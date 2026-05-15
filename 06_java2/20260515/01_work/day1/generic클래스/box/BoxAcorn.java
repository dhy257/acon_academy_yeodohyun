package day1.generic클래스.box;

public class BoxAcorn {
	Acorn[] list  = new Acorn[10];
	int index=0;
	
	//add
	
	public void add( Acorn i) {
		list[index] =i;
		index++;
	}
	
	
	//get
	
	public Acorn get( int i) {
		return list[i];
	}
	
	
	
	//size
	
	public int size() {
		return index;
	}
}
