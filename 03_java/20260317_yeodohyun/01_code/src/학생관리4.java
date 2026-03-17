
import java.util.Scanner;

public class 학생관리4 { // new 학생관리3()= > 해야지만 데이터 , 기능을 사용할 수 있다

	Student3[] list = new Student3[5];
	int index = 0;
	Scanner sc = new Scanner(System.in);

	// 등록하기
	public void 등록하기() {
		System.out.println("등록");
		System.out.println("이름, 국어, 영어 입력하시오");
		String name = sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();

		Student3 s = new Student3(name, kor, eng);
		list[index] = s;
		index++;

	}

	// 변경하기

	public void 변경하기() {

	}

	// 조회하기

	public void 조회하기() {
		System.out.println("조회");
		for (int i = 0; i < index; i++) {
			System.out.println(list[i].toString());
		}
	}

	// 삭제하기

	public void 삭제하기() {

	}

	public void 성적처리하기() {

		for (int i = 0; i < index; i++) {
			list[i].calcGrade();
		}

	}

	// 실행하기
	public void run() { // 반복문에서 메뉴제공

		int menu;
		loop: while (true) {
			System.out.println("1.등록 2.조회 3. 변경, 4. 삭제 5. 종료 6.성적처리");
			menu = sc.nextInt(); // 키보에 입력을 하면 입력버퍼에 입력한 모든내용이 저장된다
									// nextInt는 스페이스, 엔터값은 읽어오지 않는다 , 입력버퍼에 엔터가 남아 있다
									// 엔터비우기
			sc.nextLine();

			switch (menu) {

			case 1:
				// System.out.println("등록");
				등록하기();
				break;
			case 2:
				// System.out.println("조회");
				조회하기();
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("종료");
				break loop;
			case 6:
				성적처리하기();
				break;
			default:
				System.out.println("메뉴x");
			}

		}

	}

	public static void main(String[] args) {

		학생관리4 a = new 학생관리4();
		a.run();

		/*
		 * Student3 [] list = new Student3[5]; int index=0; Scanner sc = new
		 * Scanner(System.in );
		 * 
		 * 
		 * 
		 * int menu; loop:while(true) {
		 * System.out.println("1.등록 2.조회 3. 변경, 4. 삭제 5. 종료  6. 성적처리"); menu=
		 * sc.nextInt();
		 * 
		 * sc.nextLine(); //남아 있는 엔터값 지우기 switch(menu) {
		 * 
		 * case 1: System.out.println("등록"); System.out.println("이름, 국어, 영어 입력하세요");
		 * String tempName = sc.nextLine(); int tempKor = sc.nextInt(); int tempEng =
		 * sc.nextInt(); Student3 s = new Student3(tempName, tempKor, tempEng);
		 * list[index]= s; index++; break; case 2: System.out.println("조회"); for( int
		 * i=0; i<index; i++) { System.out.println( list[i].toString()); } break; case
		 * 3: System.out.println("변경"); break; case 4: System.out.println("삭제"); break;
		 * case 5: System.out.println("종료"); break loop; case 6: for( int i=0; i< index;
		 * i++) { list[i].calcGrade(); } break; default: System.out.println("메뉴x"); }
		 * 
		 * }
		 */

	}

}
