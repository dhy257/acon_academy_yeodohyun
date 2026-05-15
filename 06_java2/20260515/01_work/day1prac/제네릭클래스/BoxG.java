package day1prac.제네릭클래스;

//다이아몬드연산자

//타입매개변수 

public class BoxG<T> {
	//
	Object[] list = new Object[10];
	int index;

	// 추가

	public void add(T item) {
		list[index] = item;
		index++;
	}

	// 꺼내기

	public T get(int i) {
		return (T) list[i];
	}

	// 사이즈 얻어오기
	public int size() {
		return index;
	}

}
