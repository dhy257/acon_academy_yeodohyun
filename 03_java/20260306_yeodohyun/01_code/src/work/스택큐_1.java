package work;

import java.util.Scanner;
import java.util.Stack;

public class 스택큐_1 {
    public static void main(String[] args) {

        // 입력 받기
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
