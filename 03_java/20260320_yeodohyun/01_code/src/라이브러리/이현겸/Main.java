package 라이브러리.이현겸;

public class Main {

	public static void main(String[] args) {
		
		MyUtil_이현겸 a = new MyUtil_이현겸();
		
		a.별세개출력하기();
		
		a.원하는문자세번출력하기('흥');
		
//		a.코드세번실행하기(new 원하는코드());
		a.코드세번실행하기(new AA()); // 익명클래스
		a.코드세번실행하기(new 원하는코드() { // 클래스를 상속해서 익명으로 클래스를 만드는것
			@Override
			public void 구구단(int dan) {
				// TODO Auto-generated method stub
//				super.구구단(dan);
				System.out.println("바뀐 원하는 코드");
			}
		});
	}

}
