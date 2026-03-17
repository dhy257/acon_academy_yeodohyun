package 상속맛보기_상속;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.걷기();
		StudentWorker sw = new StudentWorker();
		sw.걷기();
		Research r = new Research();
		r.걷기();
		Professor p = new Professor();
		p.걷기();

		// 자식 타입의 객체를 부모타입으로 다룰 수 있음
		// 업캐스팅, 자동형변환
		Person[] arr = new Person[4];
		arr[0] = s;
		arr[1] = sw;
		arr[2] = s;
		arr[3] = p;
		for (int i = 0; i < arr.length; i++) {
			arr[i].걷기();
		}
	}

}
