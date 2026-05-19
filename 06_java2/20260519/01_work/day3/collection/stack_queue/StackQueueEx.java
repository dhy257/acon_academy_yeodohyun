package day3.collection.stack_queue;
import java.util.*;

 

class StackQueueEx {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Queue<String> q = new ArrayDeque<>(); // Queue 인터페이스의 구현체로 ArrayDeque 사용

        // 스택에 값 저장 push
        st.push("0");
        st.push("1");
        st.push("2");

        // 큐에 값 저장 offer
        q.offer("0");
        q.offer("1");
        q.offer("2");

        // pop
        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop());  // 마지막 값부터 꺼내진다
        }

        // poll
        System.out.println("= Queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll());  // 맨 먼저 넣은 값부터 꺼내진다
        }
    }
}
