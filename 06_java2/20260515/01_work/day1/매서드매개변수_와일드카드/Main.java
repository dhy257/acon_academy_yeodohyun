package day1.매서드매개변수_와일드카드;

import java.util.ArrayList;
import java.util.List;

class Person2 {

    String name;

    Person2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person : " + name;
    }
}

class Student extends Person2 {

    Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student : " + name;
    }
}

class Worker extends Person2 {

    Worker(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Worker : " + name;
    }
}

public class Main {

    // =========================
    // extends : 읽기 중심
    // =========================
    public static void printList(List<? extends Person2> list) {

        System.out.println("===== extends =====");

        // 읽기는 안전
        for (Person2 p : list) {
            System.out.println(p);
        }

        // 추가는 위험해서 불가능
        // list.add(new Person2("홍길동")); //  이유  Person2를 상속받은 어떤 클래스일지 모르기 때문에 불가능하다 .
    }

    // =========================
    // super : 쓰기 중심
    // =========================
    public static void addPeople(List<? super Person2> list) {

        System.out.println("===== super =====");

        // 추가는 안전
        list.add(new Person2("김철수"));
        list.add(new Student("이영희"));
        list.add(new Worker("박민수"));

        System.out.println("데이터 추가 완료");

        // 꺼낼 때는 정확한 타입 모름
        Object obj = list.get(0);

        System.out.println(obj);
    }

    public static void main(String[] args) {

        // =========================
        // extends 예제
        // =========================
        List<Student> students = new ArrayList<>();
        students.add(new Student("학생1"));
        students.add(new Student("학생2"));

        // Student 리스트 전달 가능
        printList(students);

        System.out.println();

        // =========================
        // super 예제
        // =========================

        List<Object> objects = new ArrayList<>();

        // Object 리스트 전달 가능
        addPeople(objects);

        System.out.println();

        System.out.println("===== 최종 출력 =====");

        for (Object o : objects) {
            System.out.println(o);
        }
    }
}