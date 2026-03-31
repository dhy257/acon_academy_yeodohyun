package day21.라면끓이기.공유자원;

class Ramen {
    static int count = 10; //   공유자원
}

class Chef extends Thread {

    public Chef(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {

            synchronized (Ramen.class) { //  클래스 락

                if (Ramen.count <= 0) {
                    System.out.println(getName() + " : 라면 없음");
                    break;
                }

                System.out.println(getName() + " : 라면 끓이는 중...");
                Ramen.count--; //   감소

                System.out.println(getName() + " : 남은 라면 = " + Ramen.count);
            }

            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {

        new Chef("요리사1").start();
        new Chef("요리사2").start();
    }
}