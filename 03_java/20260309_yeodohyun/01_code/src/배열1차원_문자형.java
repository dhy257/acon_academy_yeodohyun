
public class 배열1차원_문자형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hello
		// 문자5개 배열을 사용하여 출력

		char a = 'h';
		char b = 'e';
		char c = 'l';
		char d = 'l';
		char e = 'o';

//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);

		char[] str = new char[5];
		str[0] = 'h';
		str[1] = 'e';
		str[2] = 'l';
		str[3] = 'l';
		str[4] = 'o';

		for (int i = 0; i < str.length; i++)
			System.out.print(str[i]);
		System.out.println("\n");

		char[] str2 = new char[] { 'h', 'e', 'l', 'l', 'o' };
		for (int i = 0; i < str2.length; i++)
			System.out.print(str2[i]);
		System.out.println("\n");
		
		char[] str3 = { 'h', 'e', 'l', 'l', 'o' };
		
		for (int i = 0; i < str3.length; i++)
			System.out.print(str3[i]);
	}

}
