package code;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		// class -> main
		java.lang.String name = "장해든";
		// 비교할때
		if (name.equals("장해든")) {
			System.out.println("맞아요 ^^");
		}

		char ch = '장';
		char ch2 = '해';
		char ch3 = '든';

		System.out.println(name);

		System.out.print(ch);
		System.out.print(ch2);
		System.out.print(ch3);

		System.out.println();
		char[] name2 = { '장', '해', '든' }; // 배열초기화
		System.out.print(name2[0]);
		System.out.print(name2[1]);
		System.out.print(name2[2]);
	}

}
