package j0311;

public class 함수_김재민 {

    // 기능명 (함수명): getRandomBrandIndex
    // 설명: 햄버거 브랜드 배열에서 랜덤으로 브랜드 인덱스를 선택한다.
    // 입력 (매개변수): String[][][] hamburger (햄버거 3차원 배열)
    // 반환: int (선택된 브랜드의 인덱스 값)
    public static int getRandomBrandIndex(String[][][] hamburger) {
        return (int)(Math.random() * hamburger.length);
    }

    // 기능명 (함수명): getRandomBurgerIndex
    // 설명: 선택된 브랜드 안에서 랜덤으로 햄버거 인덱스를 선택한다.
    // 입력 (매개변수):
    //      int brandIndex (선택된 브랜드 인덱스)
    //      String[][][] hamburger (햄버거 3차원 배열)
    // 반환: int (선택된 햄버거의 인덱스 값)
    public static int getRandomBurgerIndex(String[][][] hamburger, int brandIndex) {
        return (int)(Math.random() * hamburger[brandIndex].length);
    }
    // 기능명 (함수명): printBurgerInfo
    // 설명: 랜덤으로 선택된 햄버거의 브랜드, 이름, 가격, 칼로리를 출력한다.
    // 입력 (매개변수):
    //      String[] brand (브랜드 이름 배열)
    //      String[][][] hamburger (햄버거 정보 3차원 배열)
    //      int brandIndex (선택된 브랜드 인덱스)
    //      int burgerIndex (선택된 햄버거 인덱스)
    // 반환: 없음 (void)

    public static void printBurgerInfo(String[] brand, String[][][] hamburger, int brandIndex, int burgerIndex) {

        System.out.println("오늘의 추천 햄버거");
        System.out.println("브랜드: " + brand[brandIndex]);
        System.out.println("이름: " + hamburger[brandIndex][burgerIndex][0]);
        System.out.println("가격: " + hamburger[brandIndex][burgerIndex][1]);
        System.out.println("칼로리: " + hamburger[brandIndex][burgerIndex][2]);
    }

    public static void main(String[] args) {


        //배열 선언

        String[] brand = {"맥도날드", "맘스터치", "롯데리아", "버거킹"};

        String[][] McDonald = {
                {"베토디", "5500원", "480kcal"},
                {"1955", "6400원", "500kcal"},
                {"빅맥", "6300원", "550kcal"},
                {"쿼파치", "6500원", "600kcal"}
        };

        String[][] MomsTouch = {
                {"싸이", "4500원", "550kcal"},
                {"화이트갈릭", "4800원", "570kcal"},
                {"인크레더블", "5200원", "600kcal"},
                {"딥치즈싸이", "5500원", "620kcal"}
        };

        String[][] LotteRia = {
                {"불고기", "4200원", "430kcal"},
                {"새우", "4700원", "450kcal"},
                {"데리", "4300원", "440kcal"},
                {"나폴리맛피아", "6000원", "500kcal"}
        };

        String[][] BurgerKing = {
                {"와퍼", "7100원", "650kcal"},
                {"와퍼주니어", "5500원", "500kcal"},
                {"통새우와퍼", "7500원", "670kcal"},
                {"콰트로치즈", "7600원", "700kcal"}
        };


        String[][][] Hamburger = {McDonald, MomsTouch, LotteRia, BurgerKing};



        //함수사용

        // 랜덤 브랜드 선택
        int i = getRandomBrandIndex(Hamburger);

        // 랜덤 햄버거 선택
        int j = getRandomBurgerIndex(Hamburger, i);

        // 결과 출력
        printBurgerInfo(brand, Hamburger, i, j);
    }

}
