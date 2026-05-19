package day3.collection;
import java.util.LinkedList;

public class LinkedListEx  {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("사과");
        list.add("오렌지");
        list.add("망고");

        // 첫 번째에 추가
        list.addFirst("오렌지");

        // 마지막에 추가
        list.addLast("포도");

        // 리스트 출력
        System.out.println("전체 리스트: " + list);

        // 특정 요소 가져오기
        String firstFruit = list.getFirst();
        System.out.println("첫 번째 과일: " + firstFruit);

        // 요소 제거
        list.remove("바나나");
        System.out.println("바나나 삭제 후 리스트: " + list);

        // 비어있는지 확인
        System.out.println("리스트가 비어 있나요? " + list.isEmpty());
    }
}
