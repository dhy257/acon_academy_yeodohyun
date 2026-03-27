package 팀플4;

import java.io.File;
import java.io.IOException;

public class MainLauncher {
    public static void main(String[] args) {
        try {
            // 현재 위치 가져오기
            String currentDir = System.getProperty("user.dir");
            System.out.println("현재 디렉터리: " + currentDir);

            // bin 폴더 위치 (프로젝트 구조에 따라 상대 경로 수정)
            String binPath = currentDir + File.separator + "bin";

            // CMD 실행
            ProcessBuilder pb = new ProcessBuilder(
                "cmd", "/c", "start", "cmd", "/k",
                "java -cp \"" + binPath + "\" 팀플4.Main"
            );

            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}