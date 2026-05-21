package day5.optional;

import java.util.Optional;

public class Ex02 {
    public static void main(String[] args) {
        // 값이 있는 Optional
        Optional<String> nameOpt = Optional.ofNullable("홍길동");

        // 값이 null일 수도 있는 Optional
        Optional<String> emptyOpt = Optional.ofNullable(null);

        // isPresent()로 값 존재 여부 확인
        if (nameOpt.isPresent()) {
            System.out.println("nameOpt 값: " + nameOpt.get());
        } else {
            System.out.println("nameOpt 값이 없습니다.");
        }

        if (emptyOpt.isPresent()) {
            System.out.println("emptyOpt 값: " + emptyOpt.get());
        } else {
            System.out.println("emptyOpt 값이 없습니다.");
        }
    }
}