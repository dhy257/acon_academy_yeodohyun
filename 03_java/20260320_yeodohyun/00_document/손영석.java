package Interface;

public class 손영석 implements FoodFighter, Adaptable {


    @Override
    public void foodFight() {
        System.out.println("나는 연어을 많이 먹을 수 있어요.");
    }

    @Override
    public void anotherPersonality() {
        System.out.println("집 밖을 나서면 차분한 사람이 돼요.");
    }
}
