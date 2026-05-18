package day2.lambda.runnable;

//주연 Runnable
class 주연 implements Runnable {
 @Override
 public void run() {
     System.out.println("주연이는 2단 출력");
     for (int i = 1; i <= 9; i++) {
         System.out.println(2 * i);
     }
 }
}