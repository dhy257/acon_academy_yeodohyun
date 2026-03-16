package com.d0316.progress;


//  AcornStudent s  = new AcornStudent();   //  변수만들기 , 객체생성기


// 에이콘학생정보를 저장하기 위한  자료형 만들기
// 캡슐화
// 데이타+ 매서드(함수) 묶음
// 매서드가 하는 역할이 데이터를 사용한다 ( 데이터변경하거나, 단순히 읽기)
public class AcornStudent황스일 {

    // 속성
    String name;
    int 에너지;
    int 근육량;
    int 자바능력;
    int 프론트능력;
    int 스트레스; //스일 추가

    // 기능(매서드, 함수)
    // 매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)

    // 입력하기  (기본)
    // 출력하기  (기본)


    // 배열공부하기

    public void 입력하기(String name, int 에너지, int 근육량, int 자바능력, int 프론트능력, int 스트레스) {
        this.name = name;
        this.에너지 = 에너지;
        this.근육량 = 근육량;
        this.자바능력 = 자바능력;
        this.프론트능력 = 프론트능력;
        this.스트레스 = 스트레스;

    }

    // 정보 출력하기
    public void 정보출력하기() {
        System.out.println("name" + name);
        System.out.println("에너지" + 에너지);
        System.out.println("근육량" + 근육량);
        System.out.println("자바능력" + 자바능력);
        System.out.println("프론트능력" + 프론트능력);
        System.out.println("스트레스" + 스트레스);
    }


    public void 배열공부하기() {
        자바능력 += 20;
        에너지 -= 5;
    }

    public void div로풋터만들기() {
        프론트능력 += 30;
        에너지 -= 5;
    }

    public void 밥먹기() {
        에너지 += 100;
    }

    public int 웃는다() {
        에너지 += 10;
        return 10;
    }

    public void 잠자기() { //스일 추가
        에너지 += 50;
        스트레스 -= 20;
        if (스트레스 < 0) 스트레스 = 0;
    }

}
