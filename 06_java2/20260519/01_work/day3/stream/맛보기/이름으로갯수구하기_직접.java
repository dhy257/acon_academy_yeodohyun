package day3.stream.맛보기;

 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class 이름으로갯수구하기_직접 {
    public static void main(String[] args) {
        String filePath = "src/day3/stream/맛보기/data.txt";

        // 이름과 등장 횟수를 저장할 Map
        Map<String, Integer> nameCounts = new HashMap<>();

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // 한 줄씩 읽기
            while ((line = br.readLine()) != null) {
                // 이름을 key로, 등장 횟수를 value로 저장
                nameCounts.put(line, nameCounts.getOrDefault(line, 0) + 1);  //현재 이름의 개수를 가져와서 1 증가시키는 코드
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 결과 출력
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
