package javaprj.day08.구조화된데이터.손영석_객체;

public class DrinkInfo {
    public static void main(String[] args) {

        // Drink 타입으로 변수 생성
        // 구조화된변수만들기
        Drink drink1 = new Drink();
        Drink drink2 = new Drink();
        Drink drink3 = new Drink();

        input(drink1, "초코젤라또 말차라떼", 4400, true,"333");
        input(drink2, "라이트 바닐라 아몬드라떼", 3900, true,"444");
        input(drink3, "에스프레소 도피오", 2000, false,"555");

        // Drink[] drinks = {drink1, drink2, drink3};

        // DrinkService.printByTemperature(drinks, true);
        // DrinkService.printByTemperature(drinks, false);

        print(drink1);
        print(drink2);
        print(drink3);
    }

    // 입력하기
    public static void input(Drink drink, String drinkName, int price, boolean isCode, String calorie) {
        drink.drinkName = drinkName;
        drink.price = price;
        drink.isCold = isCode;
        drink.calorie = calorie; // 추가
    }

    // 출력하기
    public static void print(Drink drink){
        System.out.println(drink.drinkName);
        System.out.println(drink.price);
        System.out.println(drink.isCold);
        System.out.println(drink.calorie); // 추가
    }
}
