package 추상클래스;

public class 손영석 extends AcornStudent{

    public 손영석(){
        super("손영석");
    }
//    public 손영석(String name){
//        super(name);
//    }

    @Override
    public void 공부한다(){
        System.out.println("자바를 공부한다.");
    }
    @Override
    public void 춤추기(){
        System.out.println("어깨춤을 춘다.");
    }
    public void clean(){
        System.out.println("청소을 한다.");
    }
}
