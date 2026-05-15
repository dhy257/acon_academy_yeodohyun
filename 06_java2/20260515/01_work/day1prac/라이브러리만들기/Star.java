package day1prac.라이브러리만들기;

public class Star {

	public void printStar() {
		for (int i = 1; i <= 3; i++) {
			System.out.print("⭐");
		}
	}

	public static void main(String[] args) {
		Star star = new Star();
		star.printStar();
	}

}
