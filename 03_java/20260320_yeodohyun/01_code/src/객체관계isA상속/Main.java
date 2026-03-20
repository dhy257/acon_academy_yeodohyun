package 객체관계isA상속;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		동물 c = new 동물();

		//
		동물 a = (동물) c; // 업캐스팅 => 자동형변환, 별도로 캐스트할 필요 없음

		// 다운캐스팅 ( 업캐스팅된 거에 한해서만 해야 한다 )

		//
		((고양이) a).B매서드();
	}

}
