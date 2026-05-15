package day1prac.제네릭클래스;

public class BoxGMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoxG<Integer> box1 = new BoxG<>();
		box1.add(7);
		box1.add(11);
		box1.add(13);

		int num1 = box1.get(0);
		int num2 = box1.get(1);
		int num3 = box1.get(2);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		BoxG<String> box2 = new BoxG<>();
		box2.add("커피");
		box2.add("운동화");
		box2.add("맛집");

		String s1 = box2.get(0);
		String s2 = box2.get(1);
		String s3 = box2.get(2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
