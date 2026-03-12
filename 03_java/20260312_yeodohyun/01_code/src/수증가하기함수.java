
public class 수증가하기함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index=0;
		up(index);
		up(index); // 매개변수 전달 call by value
		System.out.println(index);
		
		
	}
	public static int up(int num) {
		num++;
		
		return num;
	}

}
