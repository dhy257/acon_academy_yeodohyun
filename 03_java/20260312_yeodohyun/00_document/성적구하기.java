package javaprj.day08;

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
 
	public static void 성적계산하기(int kor, int eng, int math) {
            int sum=총점구하기( kor, eng, math);
            double avg =  평균구하기( sum);
            String result  = 학점구하기( avg);
            
            System.out.println( sum);
            System.out.println( avg);
            System.out.println( result);
	}

}
