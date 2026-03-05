package seuil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsPositiveAndOddEvenCount02 {
    /*
     * 10개의 수가 입력될 때 양수의 개수와 음수의 개수를 구하고 양수 중에서 홀수와 짝수의 개수를 구하시오
     * */

    private final List<Integer> numbers;
    private final Scanner scanner;

    public IsPositiveAndOddEvenCount02() {
        this.numbers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        run();
    }

    public void run() {
        inputNumbers();
        Statistics stats = calculateStatistics();
        printStatistics(stats);
    }

    // 1. 사용자 입력을 받고 유효성을 검사하여 리스트에 저장
    private void inputNumbers() {
        System.out.println("양수와 음수 숫자를 10개 입력하시오 (0은 제외) ");
        int count = 0;
        while (count < 10) {
            System.out.print((count + 1) + "번 : ");
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (num == 0) {
                    System.out.println("0은 제외입니다. 다시 입력해주세요.");
                    continue;
                }
                numbers.add(num);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력해주세요.");
            }
        }
    }

    // 2. 계산
    private Statistics calculateStatistics() {
        int positiveCount = 0;
        int negativeCount = 0;
        int positiveOddCount = 0;
        int positiveEvenCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
                if (num % 2 == 0) {
                    positiveEvenCount++;
                } else {
                    positiveOddCount++;
                }
            } else if (num < 0) {
                negativeCount++;
            }
        }
        return new Statistics(positiveCount, negativeCount, positiveOddCount, positiveEvenCount);
    }

    // 3. 출력
    private void printStatistics(Statistics stats) {
        System.out.println("양수의 개수 : " + stats.positiveCount);
        System.out.println("음수의 개수 : " + stats.negativeCount);
        System.out.println("양수 중 홀수의 개수 : " + stats.positiveOddCount);
        System.out.println("양수 중 짝수의 개수 : " + stats.positiveEvenCount);
    }

    // DTO
    private static class Statistics {
        final int positiveCount;
        final int negativeCount;
        final int positiveOddCount;
        final int positiveEvenCount;

        public Statistics(int positiveCount, int negativeCount, int positiveOddCount, int positiveEvenCount) {
            this.positiveCount = positiveCount;
            this.negativeCount = negativeCount;
            this.positiveOddCount = positiveOddCount;
            this.positiveEvenCount = positiveEvenCount;
        }
    }

    /*
    1. 예외 처리를 통한 철저한 유효성 검사 (inputNumbers)
        사용자가 실수로 숫자가 아닌 '문자'를 입력하거나, 제외 대상인 '0'을 입력했을 때
        프로그램이 죽지 않는다는 점입니다.

        try-catch 블록: Integer.parseInt() 과정에서 숫자가 아닌 값이 들어오면 에러를
        던지는 대신 "유효한 숫자를 입력해주세요"라는 안내를 띄웁니다.

        while 루프: 10개의 성공적인 입력을 받을 때까지 반복합니다. 잘못 입력해도
        count 가 올라가지 않아 반드시 10개의 데이터를 확보합니다.

    2. 단 한 번의 순회로 끝내는 효율적인 연산 (calculateStatistics)
        데이터를 여러 번 나누거나 배열을 새로 만들지 않고, 단 한 번의 for-each 루프로
        모든 통계를 계산합니다.

        양수인지 확인하면서 동시에 홀짝 여부를 판단하여 효율성을 극대화했습니다.

    3. DTO(Data Transfer Object) 패턴의 활용 (Statistics 클래스)
        데이터 묶음 배송: 여러 개의 결과값(양수 개수, 음수 개수 등)을 각각 따로 보내는 대신,
        하나의 '결과 보고서 객체'에 담아 전달합니다.

        이런 방식을 쓰면 나중에 출력 형식이 바뀌거나 통계 항목이 늘어나도 run() 메소드의 구조를
         게 건드리지 않아도 됩니다.
    */
}



