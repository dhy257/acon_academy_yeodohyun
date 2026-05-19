package day3.stream.중간연산및최종연산;
 

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;


//학생 클래스 정의
 
public class CollectEx3 {

    public static void main(String[] args) {
        // 학생 객체를 담고 있는 리스트 생성
        List<Customer> Customers = Arrays.asList(
                new Customer("철수", 23),
                new Customer("영희", 27),
                new Customer("영희", 22),
                new Customer("민수", 30)
        );

       
        List<String> 학생이름 = Customers.stream()          	 
                .map( c -> c.getName())
                .collect(Collectors.toList());

        // 결과 출력
        System.out.println(학생이름);
    } 
}
