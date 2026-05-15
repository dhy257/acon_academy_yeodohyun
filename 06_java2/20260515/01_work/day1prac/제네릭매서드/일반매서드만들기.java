package day1prac.제네릭매서드;

public class 일반매서드만들기 {

	public static void printChar(char c) {
		System.out.println(c);
	}

	public static void printString(String s) {
		System.out.println(s);
	}

	public static void printDouble(double d) {
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		printChar('c');
		printString("String");
		printDouble(125.25);
	}
}
