package day21.타이머;
import java.util.Timer;
import java.util.TimerTask;

public class TimerPrint {

    public static void main(String[] args) {

        String message = "운동을 시작해볼까요?";

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            int index = 0;

            @Override
            public void run() {
                if (index < message.length()) {
                    System.out.print(message.charAt(index));
                    index++;
                } else {
                    timer.cancel(); // 종료
                }
            }

        }, 0, 300); // 0ms 후 시작, 300ms마다 실행
    }
}