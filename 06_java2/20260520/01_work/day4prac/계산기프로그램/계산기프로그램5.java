package day4prac.계산기프로그램;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.Scanner;

public class 계산기프로그램5 {

	Calculator calculator; // Calculator calculator = new 다이소계산기();

	// 계산기가 외부에서 주입 Injection 될 수 있도록 한다 => 느슨한 결합
	// 써터나 매개변수가 있는 생성자 사용

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void run() {

		System.out.println("두 수 입력 하시오 계산해 드릴께요");
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();

		int result = calculator.add(su1, su2);
		System.out.println(result + "입니다");

	}

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Properties pp = new Properties();
		pp.load(new FileReader(
				"C:\\Users\\user\\Desktop\\acon_academy_yeodohyun\\06_java2\\20260520\\01_work\\day4prac\\계산기프로그램\\config.txt"));
		String className = pp.getProperty("calculator");
		System.out.println(className);

		Class clazz = Class.forName(className);
		Calculator calculator = (Calculator) clazz.getDeclaredConstructor().newInstance();

		계산기프로그램5 p = new 계산기프로그램5();
		// p.setCalculator(new 다이소계산기());
		p.setCalculator(calculator);
		p.run();

	}

}
