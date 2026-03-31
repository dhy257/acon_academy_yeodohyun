package day21.타이머;
import java.util.Timer;
import java.util.TimerTask;

public class FlowText {
    public static void main(String[] args) {

        Timer timer = new Timer();

        String text = "   HELLO JAVA WORLD   "; // 앞뒤 공백 주면 더 자연스러움

        TimerTask task = new TimerTask() {
            String str = text;

            @Override
            public void run() {
                // 문자열 한 칸 밀기
                str = str.substring(1) + str.charAt(0);

                // 출력
                System.out.print("\r" + str);
            }
        };

        timer.scheduleAtFixedRate(task, 0, 200); // 0.2초마다 실행
    }
}