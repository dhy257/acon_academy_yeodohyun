public class Drink2info {

    public static void main(String[] args) {
        
        Drink2 drink = new Drink2();
        // drink 참조형변수
        // 객체라고 부름


        // 1. input을 통해 위에서 만든 변수에 넣기
        // input매서드가 호출될때 drink 정보가 제공됨
        drink.input("초코젤라또 말차라떼", 4400, true,"333");
        // 2. print를 통해 위에서 만든 변수 출력
        // print라고 매서드를 호출하면 drink정보(위치)가 제공됨
        drink.print();
        // System.out.println(drink.drinkName);

        Drink2 drink2 = new Drink2(); // 변수가 만들어짐
        drink2.input("라이트 바닐라 아몬드라떼", 3900, true,"444");
        drink2.print();
    }
    
}
