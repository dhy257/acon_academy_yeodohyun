package day3.stream.맛보기;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 이름으로개수구하기 {
	
    public static void main(String[] args) {
        String filePath = "src/day3/stream/맛보기/data.txt"; // 파일 경로를 여기에 넣어주세요.

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            // 각 라인에서 이름을 읽고, 각 이름의 빈도를 계산
           
             Map<String, Long> nameCounts = lines
                   .collect(Collectors.groupingBy(name -> name, Collectors.counting())); 
         
           //   Map<Character, Long> nameCounts = lines
           //         .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting())); 
        
           // 결과 출력
            nameCounts.forEach((name, count) -> 
                System.out.println(name + ": " + count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
