package day1.generic매서드;

public class NoGenericMethod3 {
    // 배열의 요소 두 개를 교환(자리바꿈하기)
    public static void 배열교환하기Char(Character[] array, int iA, int iB) {
        Character temp = array[iA];
        array[iA] = array[iB];
        array[iB] = temp;
    }

    public static void 배열교환하기String(String[] array, int iA, int iB) {
        String temp = array[iA];
        array[iA] = array[iB];
        array[iB] = temp;
    }

    public static void main(String[] args) {
        Character[] chrs = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
        String[] fruits = new String[]{"banana", "apple", "melon", "strawberry"};

        배열교환하기Char(chrs, 1, 2);
        배열교환하기String(fruits, 0, 3);

        // 셔플
        for (int i = 0; i < 100; i++) {
            배열교환하기String(fruits, (int) Math.floor(Math.random() * fruits.length), (int) Math.floor(Math.random() * fruits.length));
        }

        //과일배열 출력하기
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
