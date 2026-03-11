package Day0311;

import java.util.Scanner;

public class 성적구하기 {

	public static int 총점구하기(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
	public static double 평균구하기(int total) {
		double result = total / 3.0;
		return result;
	}
	public static String 학점구하기(double avg) {
		if(avg >= 90) {
			return "A(와 잘 받았네요 재수없어요)";
		}else if(avg>=80) {
			return "B(평타치셨네요 더 노력하면 A)";
		} else if(avg>= 70) {
			return "C(흠 망했네요 좀 더 노력하세요)";
		} else if(avg>= 60) {
			return "D(재수강하세요제발그냥";
		} else {
			return "F(그냥 재수강하세요)";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("총 인원이 입력해주세요");
		int member = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i<= member; i++) {
			System.out.println("학생 이름을 적어주세요");
			String name = sc.nextLine();
			
			System.out.println("국어 점수를 입력해주세요");
			int kor = sc.nextInt();
			
			System.out.println("영어 점수를 입력해주세요");
			int eng = sc.nextInt();
			
			System.out.println("수학 점수를 입력해주세요");
			int math = sc.nextInt();
			sc.nextLine();
			
			int total = 총점구하기(kor,eng,math);
			double avg = 평균구하기(total);
			String test = 학점구하기(avg);
			
			System.out.println("이름: " + name);
			System.out.println("총점: " + total);
			System.out.println("평균: " + avg);
			System.out.println("학점: " + test);	
		}
	}

}
