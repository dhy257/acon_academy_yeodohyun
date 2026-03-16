package javaprj.day10;


//  AcornStudent s  = new AcornStudent();   //  변수만들기 , 객체생성기


// 에이콘학생정보를 저장하기 위한  자료형 만들기
//캡슐화 
//데이타+ 매서드(함수) 묶음
//매서드가 하는 역할이 데이터를 사용한다 ( 데이터변경하거나, 단순히 읽기)
public class AcornStudent {


    //속성
    String name;
    int energy;
    int mass;
    int performance;
    int frontAbility;
    int stress;


    //기능(매서드, 함수)
    //매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)

    //입력하기  (기본)
    //출력하기  (기본)


    //배열공부하기

    public void input(String name, int energy, int mass, int performance, int frontAbility, int stress) {
        this.name = name;
        this.energy = energy;
        this.mass = mass;
        this.performance = performance;
        this.frontAbility = frontAbility;
        this.stress = stress;

    }

    //정보 출력하기
    public void printInfo() {
        System.out.println("name : " + name);
        System.out.println("energy : " + energy);
        System.out.println("mass : " + mass);
        System.out.println("performance : " + performance);
        System.out.println("frontAbility : " + frontAbility);
        System.out.println("stress : " + stress);
    }


    public void studyArray() {
        performance += 20;
        mass += 20;
        energy -= 5;
        stress += 10;

    }

    public void makeDiv() {
        frontAbility += 30;
        mass += 5;
        energy -= 5;
        stress += 5;
    }


    public void eat() {
        energy += 100;
        stress -= 10;
    }


    public int smile() {
        energy += 10;
        stress -= 10;
        return 10;
    }

    public void studyObject(){
        performance += 20;
        mass += 10;
        energy -= 10;
        stress += 20;
    }


}
