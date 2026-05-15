package day1.generic매서드;

public class MyGenericMethod2 {
	
	//배열, 요소값 
	//배열 중에 요소값과 일치하는 총개수를 반환하는 매서드 이다

	
    public static <T> int 일치하는개수구하기(T[] array, T element) {    	
        int count = 0;
        for (T e : array) {
            if (e.equals(element)) {
                count++;
            }
        }
        return count;
    }
     

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 1, 2, 1};
        int 개수 = MyGenericMethod2.<Integer>일치하는개수구하기(numbers, 1);
        System.out.println(" 1의 개수: " + 개수);   
        
        
        String[] words = {"apple", "banana", "apple", "orange", "grape", "apple"};
        개수 =  MyGenericMethod2.<String>일치하는개수구하기(words, "apple");
        System.out.println("사과의 개수: " + 개수);
        
        
        Boolean[] flags = {true, false, true, true, false, false, true};
        개수 =  MyGenericMethod2.<Boolean>일치하는개수구하기(flags, true);
        System.out.println("참의 개수" + 개수);
        
        
        Character[] characters = {'a', 'b', 'c', 'a', 'd', 'e', 'a'};
        개수 =  MyGenericMethod2.<Character>일치하는개수구하기(characters, 'a');
        System.out.println("a 문자의 개수 : " + 개수); 
       
    }
    
    
     
      
    
    
    
}
