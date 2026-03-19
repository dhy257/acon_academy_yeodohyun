package 추상클래스;

public class 김재민 extends AcornStudent{
    public 김재민(){
        super("김재민");
    }
    @Override
    public void 공부한다(){
        System.out.println("김재민은 공부한다");
    }

    @Override
    public void 춤추기() {
        System.out.println("김재민은 춤춘다");
    }
}
