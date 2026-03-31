package day21.interrupt;

class SumThread extends Thread {
	
    private int start;
    private int end;
    private int result;

    
    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.println(start + "~" + end + " 부분합: " + result);
    }

    public int getResult() {
        return result;
    }
}

public class Main {
	
	
    public static void main(String[] args) throws InterruptedException {

        SumThread t1 = new SumThread(1, 25);
        SumThread t2 = new SumThread(26, 50);
        SumThread t3 = new SumThread(51, 75);
        SumThread t4 = new SumThread(76, 100);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //   중요: 작업 끝날 때까지 기다림
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // 결과 합치기
        int total = t1.getResult() + t2.getResult()
                  + t3.getResult() + t4.getResult();

        System.out.println("최종 합: " + total);
    }
}