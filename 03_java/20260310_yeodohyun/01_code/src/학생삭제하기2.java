import java.util.Scanner;

public class 학생삭제하기2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[] { "ㅇㅇ", "ㅁㅁ", "ㄴㄴ", "ㄷㄷ", "ㅂㅂ" };

        // 전체 조회
        for (int i = 0; i < name.length; i++) {
            System.out.printf("학생%d이름:%s\n", i + 1, name[i]);
        }

        // 삭제할 index 선택
        int index;
        System.out.println("학생 n 삭제 요청:");
        index = sc.nextInt() - 1;

        // 삭제 (뒤에 있는 값을 앞으로 당김)
        for (int i = index; i < name.length - 1; i++) {
            name[i] = name[i + 1];
        }

        // 마지막 값 비우기
        name[name.length - 1] = null;

        // 조회
        for (int i = 0; i < name.length; i++) {
            System.out.printf("학생%d이름:%s\n", i + 1, name[i]);
        }
    }
}