package day3.stream만나기;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림만들기 {
    public static void main(String[] args) {

          //     컬렉션(Collection)에서 스트림 생성
    	  // ArrayList 생성
        List<String> fruits = new ArrayList<>();

        // 요소 추가
        fruits.add("딸기");
        fruits.add("포도");
        fruits.add("사과");

        Stream<String> listStream = fruits.stream();
        listStream.forEach(  s -> System.out.println( s));


        //     배열(Array)에서 스트림 생성
        String[] arr = {"홍길동", "이순신", "강감찬"};
        Stream<String> arrayStream = Arrays.stream(arr);
        arrayStream.forEach(System.out::println);


        //    기본형 배열에서 스트림 생성
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(System.out::println);


        //     Stream.of() 로 직접 값 지정
        Stream<String>  streamcreate = Stream.of("Java", "서블릿", "스프링");
        streamcreate.forEach(System.out::println);

 
 

        //     파일이나 라인 스트림 (Files.lines)
        // (실제 파일 스트림 예시 - 주석 처리)
        
        try (Stream<String> lineStream = Files.lines(Paths.get("data.txt"))) {
            lineStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        // 파일 경로  
        String filePath = "data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) { // 한 줄씩 읽기
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        try (Stream<String> lineStream = 
                Files.lines(Paths.get("src/day3/stream만나기/test.txt"))) {
           lineStream.forEach(System.out::println);
       } catch (IOException e) {
           e.printStackTrace();
       }

        //     두 스트림 합치기
        Stream<String> s1 = Stream.of("A", "B");
        Stream<String> s2 = Stream.of("C", "D");
        Stream<String> combined = Stream.concat(s1, s2);
        combined.forEach(System.out::println);
    }
}
