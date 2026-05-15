package day1.generic클래스.box;

public class BoxTMain {

	public static void main(String[] args) {
	 
		
		

		Box<Integer> intlist  = new Box<>();		
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		
		for( int i=0 ; i< intlist.size() ; i++) {
			int item  = intlist.get(i);
			System.out.println( item);
		}

		 
		
		
		Box<String> strlist = new Box<>();
		strlist.add("hi");
		strlist.add("hello");
		strlist.add("안녕");
		
		
		
	 

		for( int i=0 ; i< strlist.size() ; i++) {
			String item  = strlist.get(i);
			System.out.println( item);
		}
		
		
		
		
		Box<Acorn> list  = new Box<>();
		list.add( new Acorn("test01" ,"123" ,"박예린"));
		list.add( new Acorn("test02" ,"000" ,"이정호"));
		list.add( new Acorn("test03" ,"567" ,"김민환"));
		
		
		
		for( int i=0 ; i< list.size() ; i++) {
			Acorn item  = list.get(i);
			System.out.println( item);
		}

	}

}
