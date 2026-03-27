package 팀플4;

public class GameTimer {
    private long startTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public String getFormattedElapsedTime() {
        long now = System.currentTimeMillis();
        long duration = (now - startTime) / 1000;
        long minutes = duration / 60;
        long seconds = duration % 60;
        return minutes + "분 " + seconds + "초";
    }
}