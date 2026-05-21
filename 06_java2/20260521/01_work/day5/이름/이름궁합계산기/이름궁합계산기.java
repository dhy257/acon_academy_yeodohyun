package day5.이름.이름궁합계산기;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

 

public class 이름궁합계산기 {

	MatchCountCalc mcc;
	
	public 이름궁합계산기(MatchCountCalc mcc) {
		super();
		this.mcc = mcc;
	}
	
	public void run() {
		// Scanner 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("본인의 이름을 입력하세요");
		String name1 = sc.nextLine();
		System.out.println("상대방의 이름을 입력하세요");
		String name2 = sc.nextLine();
						
		// 계산하기
		int result = mcc.matchCalculate(name1, name2);
						
		// 출력하기
		System.out.println("\n💕 궁합 결과: " + result + "% 💕");
	}
		
		



	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 생성할 클래스 정보 읽어오기
		// 설정파일 읽어오기 - Properties
		Properties pp = new Properties();
		pp.load(new FileReader("src/day5/이름/이름궁합계산기/config.txt"));
		 String className = pp.getProperty("MatchCalculator");
		 System.out.println(className);
		 		
		 Class clazz = Class.forName(className);
		 //Class<?>  clazz = Class.forName(className);
		 //Class<String>
		 //Class<Integer>
		 //Class<Member>  =>  Class<?>로 받을 수 있음    (아무 타입이나 가능하다 !! ? extends Object)
		 MatchCountCalc matchCountCalc = (MatchCountCalc)clazz.newInstance();
		 
		 		
				
		이름궁합계산기 p = new 이름궁합계산기(matchCountCalc);
		p.run();
		

	}

}
