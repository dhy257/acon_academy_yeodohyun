package day21.라면끓이기.공유자원;

class Ramen2 {
    static int count = 10; //   공유자원
}

class Chef2 extends Thread {

    public Chef2(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) { 
             

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

public class Main2 {
    public static void main(String[] args) {

        new Chef2("요리사1").start();
        new Chef2("요리사2").start();
    }
}