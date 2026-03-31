package day21.요리사라면;

class Chef {
    private int ramen = 10; // 요리사가 가진 라면

    public synchronized void cook() { // == synchronized(this)
        if (ramen <= 0) {
            System.out.println(Thread.currentThread().getName() + " : 라면 없음");
            return;
        }

        System.out.println(Thread.currentThread().getName() + " : 요리 시작");
        
        ramen--;
        
        System.out.println(Thread.currentThread().getName() + " : 남은 라면 = " + ramen);

        try { Thread.sleep(300); } catch (Exception e) {}
    }
}
 
public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef(); //   하나만 생성

        Runnable task = () -> {
            while (true) {
                chef.cook(); // 같은 객체 사용

                if (Thread.currentThread().isInterrupted()) break;
            }
        };

        Thread t1 = new Thread(task, "손님1");
        Thread t2 = new Thread(task, "손님2");

        t1.start();
        t2.start();
    }
}