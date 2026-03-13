
public class Snack2Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Snack2 s = new Snack2(); // 변수정보 + 변수를 쓰는 함수(매서드)
		// s는 이제 객체라고 부름
		// s는 참조형변수(위치정보를 저장하는 변수)
		
		// 첫번째 인자로 변수의 정보, 즉 객체의 정보가 전달된다	
		s.inputSnackInfo("맛동산", "해태", "500", 200);
		// 출력하기 호출할 때 s객체, s변수의 정보가 전달된다
		s.printSnackInfo();
	}

}
