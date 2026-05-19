package day3prac.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = null;
//		list = new ArrayList<>();
		// Linked List
		list = new LinkedList<String>();
		
		list.add("딸기");
		list.add("바나나");
		list.add("수박");

		String r1 = list.get(0);
		String r2 = list.get(1);
		String r3 = list.get(2);

		list.add("딸기");
		list.add("바나나");
		list.add("수박");

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

}
