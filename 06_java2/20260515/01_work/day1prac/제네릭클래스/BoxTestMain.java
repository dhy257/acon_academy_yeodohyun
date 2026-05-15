package day1prac.제네릭클래스;

public class BoxTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxInt box1 = new BoxInt();
		box1.add(7);
		box1.add(8);
		box1.add(15);
		
		int su1 = box1.get(0);
		int su2 = box1.get(1);
		int su3 = box1.get(2);
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		
		
		
		BoxString box2 = new BoxString();
		box2.add("i");
		box2.add("love");
		box2.add("java");
		
		String str1 = box2.get(0);
		String str2 = box2.get(1);
		String str3 = box2.get(2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
