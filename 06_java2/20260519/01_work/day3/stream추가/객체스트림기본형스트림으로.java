package day3.stream추가;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 객체스트림기본형스트림으로 {
    public static void main(String[] args) {
         Stream<Integer> objectStream = Stream.of(1, 2, 3, 4, 5);

         
         
        //IntStream intStream = objectStream.mapToInt(i -> i);
        //intStream.forEach(i -> System.out.println(i));
        
         //기본형스트림에는  합계 제공함 
         int sum= objectStream.mapToInt(i -> i).sum();
         //int sum= objectStream.mapToInt(i -> i.intValue()).sum();
         
         
        
        
    }
}