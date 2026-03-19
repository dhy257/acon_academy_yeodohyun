package 추상클래스;

public class 황스일 extends AcornStudent{
    public 황스일(){
        super("황스일");
    }
    @Override
    public void 게임한다(){
        System.out.println("황스일은 게임한다");
    }

    @Override
    public void 잔다() {
        System.out.println("황스일은 잔다");
    }
}
