package 객체배열;

public class NullpointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적데이터 저장할 배열 만들기
		// 객체배열만들기

		Score[] arr = new Score[3];
//		arr[0].printInfo(); // java.lang.NullPointerException:
		
		arr[0]=new Score(1,90,80,89);
		arr[1]=new Score(2,90,90,89);
		arr[2]=new Score(3,99,50,89);
		
		arr[0].printInfo();
		arr[1].printInfo();
		arr[2].printInfo();
	}
}