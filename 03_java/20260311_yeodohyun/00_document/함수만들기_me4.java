package javaprj.day07;

public class 함수만들기_me4 {
	
	/*
	 * 기능 : 미소녀호감도계산하기
	 * 입력 : o
	 * 반환 : o
	 */
	
	public static int 호감도상승(int gift) {
		int love = gift * 10;
		return love;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 호감도상승(3);
		System.out.println("미소녀 호감도: " + result);
	}

}
