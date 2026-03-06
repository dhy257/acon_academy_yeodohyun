public class 제어문_dowhile {
    public static void main(String[] args) {
        /*
         * do{
         * }
         * while(조건);
         * while(조건){
         * }
         */

        // 1-10합
        int sum = 0;
        int i = 0;
        do{
            i+=1;
            sum+=i;
        }
        while(i<10);
        System.out.println(sum);
    }
}
