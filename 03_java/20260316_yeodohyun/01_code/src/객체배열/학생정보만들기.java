package 객체배열;

public class 학생정보만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AcornStudent2 여도현 = new AcornStudent2("여도현", 1000, 30, 50, 100);

		// 여러 객체를 다루기 위해선 배열(객체배열) 사용 >> 크기 알아야 함

		AcornStudent2[] list = new AcornStudent2[16];

		AcornStudent2 장해든 = new AcornStudent2("장해든", 1000, 30, 50, 100);
		AcornStudent2 이현겸 = new AcornStudent2("이현겸", 1000, 190, 1, 2);
		AcornStudent2 박세인 = new AcornStudent2("박세인", 1000, 30, 50, 100);
		AcornStudent2 엄진희 = new AcornStudent2("엄진희", 1000, 30, 50, 100);
		AcornStudent2 나해수 = new AcornStudent2("나해수", 1000, 30, 50, 100);
		AcornStudent2 송주창 = new AcornStudent2("송주창", 1000, 50, 50, 50);
		AcornStudent2 조아진 = new AcornStudent2("조아진", 1000, 30, 50, 100);
		AcornStudent2 김건희 = new AcornStudent2("김건희", 1000, 30, 50, 100);
		AcornStudent2 이정하 = new AcornStudent2("이정하", 1000, 30, 50, 100);
		AcornStudent2 이용찬 = new AcornStudent2("이용찬", 1000, 30, 50, 100);
		AcornStudent2 정철진 = new AcornStudent2("정철진", 1000, 30, 50, 100);
		AcornStudent2 김재민 = new AcornStudent2("김재민", 1000, 30, 50, 100);
		AcornStudent2 고지연 = new AcornStudent2("고지연", 800, 10, 20, 30);
		AcornStudent2 장윤성 = new AcornStudent2("장윤성", 1000, 30, 50, 100);
		AcornStudent2 손영석 = new AcornStudent2("손영석", 700, 50, 50, 50);
		AcornStudent2 김태준 = new AcornStudent2("김태준", 50, 10, 100, 100);

		list[0] = 장해든;
		list[1] = 이현겸;
		list[2] = 박세인;
		list[3] = 엄진희;
		list[4] = 나해수;
		list[5] = 송주창;
		list[6] = 조아진;
		list[7] = 김건희;
		list[8] = 이정하;
		list[9] = 이용찬;
		list[10] = 정철진;
		list[11] = 김재민;
		list[12] = 고지연;
		list[13] = 장윤성;
		list[14] = 손영석;
		list[15] = 김태준;

		for (int i = 0; i < list.length; i++) {
			list[i].정보출력하기();
		}

		AcornStudent2[] list2 = { 장해든, 이현겸, 박세인, 엄진희, 나해수, 송주창, 조아진, 김건희, 이정하, 이용찬, 정철진, 김재민, 고지연, 장윤성, 손영석, 김태준 };

		for (int i = 0; i < list2.length; i++) {
			list2[i].정보출력하기();
		}

		// list3라는 배열은 참조형변수가 연속적으로 확보되고 null로 초기화됨
		AcornStudent2[] list3 = new AcornStudent2[16];

		list3[0] = new AcornStudent2("장해든", 1000, 30, 50, 100);
		list3[1] = new AcornStudent2("이현겸", 1000, 190, 1, 2);
		list3[2] = new AcornStudent2("박세인", 1000, 30, 50, 100);
		list3[3] = new AcornStudent2("엄진희", 1000, 30, 50, 100);
		list3[4] = new AcornStudent2("나해수", 1000, 30, 50, 100);
		list3[5] = new AcornStudent2("송주창", 1000, 50, 50, 50);
		list3[6] = new AcornStudent2("조아진", 1000, 30, 50, 100);
		list3[7] = new AcornStudent2("김건희", 1000, 30, 50, 100);
		list3[8] = new AcornStudent2("이정하", 1000, 30, 50, 100);
		list3[9] = new AcornStudent2("이용찬", 1000, 30, 50, 100);
		list3[10] = new AcornStudent2("정철진", 1000, 30, 50, 100);
		list3[11] = new AcornStudent2("김재민", 1000, 30, 50, 100);
		list3[12] = new AcornStudent2("고지연", 800, 10, 20, 30);
		list3[13] = new AcornStudent2("장윤성", 1000, 30, 50, 100);
		list3[14] = new AcornStudent2("손영석", 700, 50, 50, 50);
		list3[15] = new AcornStudent2("김태준", 50, 10, 100, 100);

		for (int i = 0; i < list3.length; i++) {
			list3[i].정보출력하기();
		}

	}

}
