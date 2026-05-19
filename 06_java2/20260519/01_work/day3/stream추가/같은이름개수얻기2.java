package day3.stream추가;
 

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class 같은이름개수얻기2 {

    public static void main(String[] args) {
    	
        try (Stream<String> stream = Files.lines(Paths.get("src/day3/stream추가/test.txt"))) {
            long count = stream.filter(s -> s.equals("오윤석"))
                               .count();
            System.out.println("오윤석: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
