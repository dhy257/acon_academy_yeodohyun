package day2.lambda.consumer;
 

import java.util.function.Consumer;

// Consumer 직접만들어보기

@FunctionalInterface
interface MyConsumer<T> {
    void accept(T str); // 입력이 있고 반환이 없다
}

public class Ex01 {
    public static void main(String[] args) {

        // 1️.이름 있는 클래스
        class MyConsumerImp implements MyConsumer<String> {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        }
        

        MyConsumerImp a = new MyConsumerImp();
        a.accept("hello");
        

        // 2️. 익명 클래스
        MyConsumer<String> b = new MyConsumer<>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };
        
        b.accept("익명 클래스");

        // 3️.  람다식
        MyConsumer<String> c = str -> System.out.println(str);
        MyConsumer<Integer> d = num -> System.out.println(num * num);

        c.accept("문자열");
        d.accept(7);

        //  4 자바 내장 Consumer 인터페이스 활용
        Consumer<String> obj5 = str -> System.out.println(str);
        Consumer<Integer> obj6 = num -> System.out.println(num * num);

        obj5.accept("내장 Consumer 사용");
        obj6.accept(7);
    }
}
