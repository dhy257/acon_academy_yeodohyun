package j0309;

public class 배열_김재민 {
    public static void main(String[] args) {

        //1차원 배열
        String[] brand = {"맥도날드", "맘스터치", "롯데리아", "버거킹"};

        //2차원 배열
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

        // 3차원 배열
        String[][][] Hamburger = {McDonald, MomsTouch, LotteRia, BurgerKing};

        // 랜덤 브랜드
        int i = (int)(Math.random() * Hamburger.length);

        // 랜덤 햄버거
        int j = (int)(Math.random() * Hamburger[i].length);

        System.out.println("오늘의 추천 햄버거");
        System.out.println("브랜드: " + brand[i]);
        System.out.println("이름: " + Hamburger[i][j][0]);
        System.out.println("가격: " + Hamburger[i][j][1]);
        System.out.println("칼로리: " + Hamburger[i][j][2]);
    }
}
