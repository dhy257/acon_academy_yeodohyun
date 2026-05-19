package day3prac.collection.stream3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Customer {

	private String id;
	private String name;
	private String grade;
	private int point;

	// 생성자
	public Customer(String id, String name, String grade, int point) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	// getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}
}

public class 오후실습_여도현 {

	public static void main(String[] args) {

		// String[] 스트림

		System.out.println("===== String 배열 =====");

		String[] arr = { "aaa", "bbbb", "ccccc", "dddddd", "ee" };

		// 전체 출력
		Arrays.stream(arr).forEach(item -> System.out.println(item));

		// 길이 5 이상만 출력
		System.out.println("===== 길이 5 이상 =====");

		Arrays.stream(arr).filter(item -> item.length() >= 5).forEach(item -> System.out.println(item));

		// ArrayList<String> 스트림

		System.out.println("===== ArrayList<String> =====");

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		fruits.add("포도");
		fruits.add("수박");

		// 전체 출력
		fruits.stream().forEach(item -> System.out.println(item));

		// "바" 포함 문자열
		System.out.println("===== 바 포함 =====");

		fruits.stream().filter(item -> item.contains("바")).forEach(item -> System.out.println(item));

		// 난수 스트림

		System.out.println("===== 짝수의 합 =====");

		Random r = new Random();

		// 1~100까지 10개
		int sum = r.ints(10, 1, 101)
				.peek(item -> System.out.println("랜덤값 : " + item))
				.filter(item -> item % 2 == 0)
				.sum();

		System.out.println("짝수의 합 : " + sum);

		//

		ArrayList<Customer> list = new ArrayList<>();

		// 고객 10명 추가
		list.add(new Customer("a01", "김민수", "vvip", 9500));
		list.add(new Customer("a02", "이서연", "vip", 7200));
		list.add(new Customer("a03", "박지훈", "bronze", 1200));
		list.add(new Customer("a04", "최유진", "vvip", 15000));
		list.add(new Customer("a05", "정현우", "vip", 6800));
		list.add(new Customer("a06", "한지민", "bronze", 900));
		list.add(new Customer("a07", "오세훈", "vip", 8300));
		list.add(new Customer("a08", "강다은", "vvip", 20000));
		list.add(new Customer("a09", "윤도현", "bronze", 500));
		list.add(new Customer("a10", "송하늘", "vip", 7700));

		// 1. 고객등급이 vvip 사람 몇명인지
		System.out.println("===== vvip 인원수 =====");

		long cnt = list.stream().filter(item -> item.getGrade().equals("vvip")).count();

		System.out.println("vvip 고객 수 : " + cnt);

		// 2. 고객등급이 vip 사람만 출력
		System.out.println("===== vip 고객 목록 =====");

		list.stream().filter(item -> item.getGrade().equals("vip")).forEach(item -> System.out.println(item));

		// 3. 포인트 높은 사람순 정렬
		System.out.println("===== 포인트 높은 순 =====");

		list.stream().sorted(Comparator.<Customer, Integer>comparing(item -> item.getPoint()).reversed())
				.forEach(item -> System.out.println(item));

	}
}