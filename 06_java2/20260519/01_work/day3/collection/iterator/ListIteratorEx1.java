package day3.collection.iterator;
import java.util.*;

class ListIteratorEx1 {
	public static void main(String[] args) {
		
		//요소를 변경할 때는  listIterator를 사용한다
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator it = list.listIterator();

		while(it.hasNext()) {
			System.out.print(it.next()); // 순방향으로 진행하면서 읽어온다.
		}
		System.out.println();

		
		
		 
	}
}
