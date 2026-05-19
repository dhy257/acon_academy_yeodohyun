package day3.collection.stack_queue;
import java.util.Stack;

public class 간단한Stack예제 {
    public static void main(String[] args) {
        Stack<String> dishes = new Stack<>();

        System.out.println("접시 쌓기 게임 시작!");
        System.out.println();

        dishes.push("파란 접시");
        System.out.println("쌓음: 파란 접시");

        dishes.push("빨간 접시");
        System.out.println("쌓음: 빨간 접시");

        dishes.push("노란 접시");
        System.out.println("쌓음: 노란 접시");

        System.out.println();
        System.out.println("현재 접시 더미: " + dishes);
        System.out.println("맨 위 접시: " + dishes.peek());

        System.out.println();
        System.out.println("이제 접시를 하나씩 꺼냅니다.");

        while (!dishes.isEmpty()) {
            String dish = dishes.pop();
            System.out.println("꺼냄: " + dish);
            System.out.println("남은 접시: " + dishes);
        }

        System.out.println();
        System.out.println("접시가 모두 사라졌습니다.");
        System.out.println("Stack은 마지막에 넣은 값이 먼저 나오는 LIFO 구조입니다.");
    }
}