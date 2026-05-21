package day5.annotation.sample3;

public class WeekDayMain {

    public static void main(String[] args) {

        // enum 사용
        WeekDay day = WeekDay.MON;

        // enum 이름 출력
        System.out.println(day); // MON

        // 한글 이름 출력
        System.out.println(day.getName()); // 월

        // ordinal 출력
        System.out.println(day.ordinal()); // 0


        // 모든 enum 반복
        for (WeekDay d : WeekDay.values()) {

            System.out.println(
                    d + " : " + d.getName()
            );
        }


        // switch 사용
        switch (day) {

            case MON:
                System.out.println("월요일입니다");
                break;

            case THE:
                System.out.println("화요일입니다");
                break;

            default:
                System.out.println("기타 요일");
        }
    }
}