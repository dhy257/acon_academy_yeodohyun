package 구조화된데이터;

public class 오퍼레이터정보_탕탕이 {
	public static void main(String[] args) {
		
		오퍼레이터 탕탕이 = new 오퍼레이터();
		
		탕탕이 = input(탕탕이);
		
		System.out.println(탕탕이.이름);
		System.out.println(탕탕이.속성);
		System.out.println(탕탕이.등급);
		System.out.println(탕탕이.직군);
		System.out.println(탕탕이.성별);
		System.out.println(탕탕이.버전_출시일);
		System.out.println(탕탕이.천장_쳤는가);
	}

	public static 오퍼레이터 input(오퍼레이터 탕탕이) {
		탕탕이.이름 = "탕탕이";
		탕탕이.속성 = "빙결";
		탕탕이.등급 = 6;
		탕탕이.직군 = "캐스터";
		탕탕이.성별 = "여성";
		탕탕이.버전_출시일 = 1.1;
		탕탕이.천장_쳤는가 = true;
		
		return 탕탕이;
	}
	
}
