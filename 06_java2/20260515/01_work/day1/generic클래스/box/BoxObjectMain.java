package day1.generic클래스.box;

public class BoxObjectMain {

	public static void main(String[] args) {

		BoxObject intlist  = new BoxObject();		
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		
		for( int i=0 ; i< intlist.size() ; i++) {
			int item  = (int) intlist.get(i);
			System.out.println( item);
		}

		 
		
		
		BoxObject strlist = new BoxObject();
		strlist.add("hi");
		strlist.add("hello");
		strlist.add("안녕");
		
		
		
	 

		for( int i=0 ; i< strlist.size() ; i++) {
			String item  = (String)strlist.get(i);  // 다운캐스팅
			System.out.println( item);
		}
		
		
		
		
		BoxObject list  = new BoxObject();
		list.add( new Acorn("test01" ,"123" ,"박예린"));
		list.add( new Acorn("test02" ,"000" ,"이정호"));
		list.add( new Acorn("test03" ,"567" ,"김민환"));
		
		
		
		for( int i=0 ; i< list.size() ; i++) {
			Acorn item  = (Acorn)list.get(i);
			System.out.println( item);
		}


	}

}
