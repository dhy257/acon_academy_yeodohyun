import javaprj.day08.구조화된데이터.손영석_객체.Drink;

// 객체지향 프로그래밍 ( 구조화된 데이터 + 함수 )
// 1. 캡슐화 ( 묶음, 데이터보호 )
// 관련있는 데이터와 데이터를 사용하는 함수(매서드)를 하나의 묶음으로 사용하는 것
// 데이터를 외부에 직접 공개하지않고 매서드를 통해서만 데이터를 사용하도록 하는 것
// 접근제한자를 제공함( private, public)
// 생성자라는 문법
public class Drink2 {
    // String drinkName;
    // int price;
    // boolean isCold;
    // /* true = ice / false = hot */
    // String calorie;

    private String drinkName;
    private int price;
    private boolean isCold;
    /* true = ice / false = hot */
    private String calorie;

    // 구조화된 변수를 다루는 함수 들어옴
    // input, print 두 개의 함수는 Drink2 type을 사용하는 함수들이다

    // 1. 데이터+데이터를 다루는 함수를 하나의 단위로 설계
    // 2. static 제거 ( static은 우리가 설계한 타입의 변수가 만들어진 다음부터 사용가능하다는 뜻)
    // static을 뺴면서 Drink2라는 객체를 사용하는 놈이 됨
    // 3. 구조화된 변수의 정보를 제공받는 매서드 >> 변수의 정보를 제공받는것을 생략된 형태로 사용가능
    // 4. this를 키워드로 제공함

    // 입력하기
    // public static void input(Drink drink, String drinkName, int price, boolean
    // isCode, String calorie) {
    // drink.drinkName = drinkName;
    // drink.price = price;
    // drink.isCold = isCode;
    // drink.calorie = calorie; // 추가
    // }
    public void input(String drinkName, int price, boolean isCode, String calorie) {
        this.drinkName = drinkName;
        this.price = price;
        this.isCold = isCode;
        this.calorie = calorie; // 추가
    }

    // 출력하기
    public void print() {
        System.out.println(this.drinkName);
        System.out.println(this.price);
        System.out.println(this.isCold);
        System.out.println(this.calorie); // 추가
    }
}
