package day03prac.mvc;

public class 구구단서비스 {
	public String[] getDan3() {
		String[] dan3 = new String[9];
		for(int i = 0; i < 9; i++) {
			dan3[i] = "3 X "+(i+1)+" = "+3*(i+1);
		}
		
		return dan3;
	}
	public static void main(String[] args) {
		구구단서비스 service = new 구구단서비스();
		String[] result = service.getDan3();
		System.out.println(result[0]);
		for(int i = 0; i < 9; i++) {
			System.out.println(result[i]);
		}
	}
}
