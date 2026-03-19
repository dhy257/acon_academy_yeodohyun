package equals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score s = new Score("김태준", 100, 90);
		Score s2 = new Score("김태준", 100, 90);

		// 이 두 객체의 비교
		// Object => equals() 매서드가 존재함: 주소비교

		// 다르다
		// 이 두 객체는 다르다고 나옴
		// 생성된 객체의 주소를 비교하면 됨
		
		// equals 를 오버라이드 해아함
		if (s.equals(s2)) {
			System.out.println("두 객체는 같다");
		} else {
			System.out.println("같지 않다");
		}

	}

}
