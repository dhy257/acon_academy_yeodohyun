package work; // 본인 패키지에 맞게 수정

public class 나해수_순한1 { // 본인 클래스에 맞게 수정
    public static void main(String[] args) {
        int oddSum = 0;
        int odd = 1;

        // while 사용
        // while (true) {

        // oddSum += odd;
        // odd += 2;
        // if (odd > 99) {
        // System.out.println(oddSum);
        // break;
        // }
        // }

        // while 축약
        // while (odd <= 99) {
        // oddSum += odd;
        // odd += 2;
        // }

        // for 문 사용
        for (odd = 1; odd <= 99; odd += 2) {
            oddSum += odd;
        }

        System.out.println(oddSum);

    }
}