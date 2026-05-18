package day2.lambda;

public class Student {
    private String name;
    private int age;

    // 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString() 오버라이드
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
