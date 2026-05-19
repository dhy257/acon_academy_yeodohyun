package day3.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class SetEx {

	public static void main(String[] args) {
	
		// set : 중복허용 x , 순서 x
		
		Set<String> set = new HashSet<>();
		set.add("hi");
		set.add("hi2");
		set.add("hi2");		
		
		
		System.out.println( "set 출력1");
		Iterator<String>  it =set.iterator();
		while (it.hasNext()) {
			String str= it.next();
			System.out.println(str);
			
		}  
		
		//forEach( Consumer c );
		System.out.println( "set 출력2");
		set.forEach(   item  ->  System.out.println( item)  );
		
		
		System.out.println( "set 출력3");
		set.forEach(  new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println( t);
				
		}});
		
		
		
		
		  

	}

}
