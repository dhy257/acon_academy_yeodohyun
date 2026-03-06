public class 제어문_continue {
    public static void main(String[] args) {
        // 반복문에서 특정조건일 때 아래코드 수행하지 않고 다음반복으로 넘어가게 해 줌
        // 홀수 합 구하기 continue사용

        // 1 3 5 7 9
        int oddSum = 0;

        for (int i = 1; i < 10; i++) {

            if (i % 2 == 0)
                continue;
            System.out.println(i);
            oddSum += i;
        }
        System.out.println(oddSum);
    }
}
