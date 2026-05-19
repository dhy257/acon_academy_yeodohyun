package day3.stream추가;
 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 같은이름개수얻기3 {

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("src/day3/stream추가/test.txt"))) {
            Map<String, Long> nameCounts = stream
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
            
            // 결과 출력
            nameCounts.forEach((name, count) -> 
                System.out.println(name + " : " + count + "개")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
