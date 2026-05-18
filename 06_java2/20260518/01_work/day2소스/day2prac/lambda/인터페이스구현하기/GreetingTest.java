package day2prac.lambda.인터페이스구현하기;

@FunctionalInterface
interface MyGreeting {
    void greet();
}

// 1) 이름 있는 클래스
class GreetingImpl implements MyGreeting {

    @Override
    public void greet() {
        System.out.println("안녕하세요!");
    }
}

public class GreetingTest {

    public static void main(String[] args) {

        // 1) 이름 있는 클래스로 구현
        MyGreeting g1 = new GreetingImpl();

        System.out.println(" 이름 있는 클래스 ");
        g1.greet();


        // 2) 익명 클래스로 구현
        MyGreeting g2 = new MyGreeting() {

            @Override
            public void greet() {
                System.out.println("반갑습니다!");
            }
        };

        System.out.println("\n 익명 클래스");
        g2.greet();


        // 3) 람다식으로 구현
        MyGreeting g3 = () -> System.out.println("좋은 하루 보내세요!");

        System.out.println("\n람다식 ");
        g3.greet();
    }
}