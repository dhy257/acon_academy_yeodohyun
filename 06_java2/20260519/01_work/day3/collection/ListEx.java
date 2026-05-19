package day3.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
	 
		
		
		//List  -> LinkedList, ArrayList  ( 순서와 중복허용) => List 상속하였음 
		//하위타입을 List Type으로 다룰 수 있다 
		
	 
		
		List<String> list = null;
		
		
		ArrayList<String>  alist  = new  ArrayList<>();				
		alist.add("one");
		alist.add("two");
		alist.add("three");	 
		
		list = alist;		
		
		
		LinkedList<String > llist = new LinkedList< >();
		llist.add("oneL");
		llist.add("twoL");
		llist.add("threL");		
		
		
		//list = alist;	
		list= llist;
		list.forEach( item -> System.out.println(item)); 
		
		
		 
		 
		
		

	}

}
