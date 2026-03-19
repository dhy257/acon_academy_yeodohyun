package 추상클래스;

public class 이정하 extends AcornStudent {

    public 이정하() {
        super("이정하"); //자식의 생성자에서는 명시적으로 부모의 생성자를 호출하는 코드가 없으면 무조건 부모의 기본 생성자를 호출한다 -> super()
    }
//    public 이정하(String name) {
//        super(name);
//    }

    @Override
    public void 공부한다() {
        System.out.println("공부하다 잠들었다");
    }
    @Override
    public void 춤추기() {
        System.out.println("신나게 춤췄다");
    }

}
