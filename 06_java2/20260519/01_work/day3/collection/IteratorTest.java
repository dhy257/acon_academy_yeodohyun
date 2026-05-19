package day3.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class IteratorTest {

	
	//Iterator => Collection으로 표준화된 방법으로 다룰 때 사용한다
	public static void main(String[] args) {
		 
		 
		List<String>   list  = new ArrayList<>();
		list.add("list item1");
		list.add("list item2");
		list.add("list item3");
		
		
		Iterator<String> it =   list.iterator(); 		 
		while(it.hasNext() ) {
			System.out.println( it.next() );
		}
		 
		
		/*
		for( String str : list) {
			System.out.println( str);
		}
		*/
	 
		//String  equals & hashcode  재정의 하였음  =>  "hi2"  "hi2" 같은 객체로 인식함 
		Set<String>  set = new HashSet<>();
		set.add("hi");
		set.add("hi2");
		set.add("hi2");			
		
		
		Iterator<String>  it2= set.iterator() ;
		while(it2.hasNext() ) {
			System.out.println( it2.next() );
		}
		
		
	 		
		
		//Iterator => Collection으로 표준화된 방법으로 다룰 때 사용한다
		 System.out.println(" ============================================");
		 Collection<String> collection= null;  // Collection type 참조형 변수
		 //상속관계의 다형성
		
		    collection  = list;       // 가능
		  //  collection  =  set ;      // 가능    
		  Iterator<String>  iterator1=  collection.iterator();
		 
		  
		  System.out.println(" list, Set은  부모형인  Collection type으로 다룰 수 있다");
		  while(iterator1.hasNext() ) {
			  System.out.println( iterator1.next());
		  }
		 
		  
		
	}

}
