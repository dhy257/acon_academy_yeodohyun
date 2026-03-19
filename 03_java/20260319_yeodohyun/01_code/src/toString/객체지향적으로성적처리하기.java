package toString;

public class 객체지향적으로성적처리하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score s = new Score("홍길동", 100, 50);

//		System.out.println(s);

		Object o = s; // 업캐스팅 Object => Score
		
		System.out.println(o);
		// Object toString()
		// Score toString() 오버라이드(무조건 부모의 매서드와 완벽히 일치하면) @Override (체크해주는역할)
		
		// Object로 다뤄도 실체생성된 객체의 toString()이 동작
	}

}
