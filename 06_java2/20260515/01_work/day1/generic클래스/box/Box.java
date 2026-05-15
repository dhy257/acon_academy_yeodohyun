package day1.generic클래스.box;


//일반적인 Box 만들기 , 제네릭 클래스 만들기 “타입을 일반화한 클래스” 
//“타입을 일반화한다”는 말은 특정 타입에 종속되지 않고, 여러 타입에서 재사용할 수 있도록 만드는 것을 의미
//=> 위의 말이 어려우면
// “뭐든 될 수 있는 타입”이라고 생각하면 됨  => 너가 정하는 타입으로 타입을 결정할께 
//하나의 박스로 여러 타입을 다룰 수 있게 만든 것이 “일반화” , 뭐든 될 수 있는 박스로 생각하면됨



public class Box<T> {
	
	
	Object[] list  = new Object[10];
	int index=0;
	
	//add
	
	public void add( T  item) {
		list[index]= item;
		index++;
	}
	
	
	//get
	
	public T  get( int i) {
		return (T) list[i];
	}
	
	
	
	//size
	
	public int size() {
		return index;
	}

}
