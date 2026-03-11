
public class 화폐매수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		 입력: 돈, 이름 //
//		 출력: 화폐매수배열(8) //
//		 처리: 반복제어i //
//		 준비: 화폐매수배열(8)//
		 

		int money=213214;
		int[] 화폐매수배열 = new int[8];

		int[] 화폐단위배열 = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int i = 0; i < 화폐매수배열.length; i++) {
			화폐매수배열[i] = money / 화폐단위배열[i];
			money %= 화폐단위배열[i];
			System.out.printf("%d = %d\n",화폐단위배열[i],(화폐매수배열[i]));
		}
		
	}

}
