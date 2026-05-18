package day2.lambda.consumer;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;



//ArrayList 흉내내기

public class MyArrayList  {
    private Object[] list=new Object[10];
    private int index=0;

    // 리스트에 요소 추가
    public void add( Object item) {
        list[index]=item;
        index++;
        		
    }
    
    
    public Object get( int index) {
    	return list[index];
    }
    

    
    // forEach 메서드 흉내내기
    public void forEach(Consumer action) {
        for (int i=0; i<index; i++) {
        	Object item  = list[i];
        	
            action.accept(item);  // Consumer 인터페이스의 accept 메서드 호출하면서 배열 요소의 값의 전달함 
        }
    }
    
    
    
    public static void main(String[] args) {
		
    	MyArrayList list = new MyArrayList();
    	
    	list.add("hello");
    	list.add("hi");
    	list.add("안녕하세요");
    	
    	
    	list.forEach( item -> System.out.println( item +"!!"));
    	
    	
    	
    	list.forEach( new Consumer() {

			@Override
			public void accept(Object t) {
				  System.out.println( t + "^^");
				
			}});
    	
	}
 
}
