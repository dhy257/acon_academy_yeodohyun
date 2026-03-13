
public class Snack2 {
	String name;
	String company;
	String calories;
	int gram;

	// 이 변수들을 어떻게 사용할지 설계

	// 기능
	// 이 기능들은 반드시 위에서 설계한 변수가 만들어진 후에 사용 가능
	// 입력
	// 출력

	// 입력하기
	public void inputSnackInfo(String name, String company, String calories, int gram) {
		this.name = name;
		this.company = company;
		this.calories = calories;
		this.gram = gram;
	}

	// 출력하기
	public void printSnackInfo() {
		System.out.println(this.name);
		System.out.println(this.company);
		System.out.println(this.calories);
		System.out.println(this.gram);
	}

}
