package day21.라면끓이기.공유자원;

 
class Ramen3 {
    int count = 10; // 라면 개수
}

 
class Chef3 extends Thread {
    private Ramen3 ramen; //   공유 객체

    public Chef3(String name, Ramen3 ramen) {
        super(name);
        this.ramen = ramen;
    }

    
    @Override
    public void run() {
        while (true) {

            synchronized ( ramen) { //   객체 락
                if (ramen.count <= 0) {
                    System.out.println(getName() + " : 라면 없음");
                    break;
                }

                System.out.println(getName() + " : 라면 끓이는 중...");
                ramen.count--;

                System.out.println(getName() + " : 남은 라면 = " + ramen.count);
            }

            try {
                Thread.sleep(500); // 잠깐 쉬기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//   실행 클래스
public class Main3 {
    public static void main(String[] args) {

        //   공유자원 1개 생성
        Ramen3 ramen = new Ramen3();

        //  같은 객체를 두 스레드에 전달
        Thread chef1 = new Chef3("요리사1", ramen);
        Thread chef2 = new Chef3("요리사2", ramen);

        chef1.start();
        chef2.start();
    }
}