package day2prac.lambda.인터페이스구현하기;

interface MySpeakable {
    void speak();
}

public class speak {
    public static void main(String[] args) {

        class Kjm implements MySpeakable {
            public void speak() {
                System.out.println("룰루랄라");
            }
        }

        MySpeakable a = new Kjm();
        a.speak();

        MySpeakable b = new MySpeakable() {
            public void speak() {
                System.out.println("익명 클래스입니다");
            }
        };

        b.speak();


        MySpeakable c = () -> {
            System.out.println("람다식입니다");
        };

        c.speak();


        MySpeakable d = () -> System.out.println("한 줄 람다입니다");

        d.speak();
    }
}