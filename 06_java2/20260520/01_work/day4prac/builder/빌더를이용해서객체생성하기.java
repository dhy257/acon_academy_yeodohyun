package day4prac.builder;

public class 빌더를이용해서객체생성하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acorn a = Acorn.build()
			.id("acorn1")
			.name("사람1")
			.address("주소1")
			.age(20)
			.build();
		
		System.out.println(a.toString());
		
		Acorn b = Acorn.build() // 여기서 public static Builder build()에서 객체 생성됨
				.id("acorn2")
				.name("사람2")
				.build();
		
		System.out.println(b.toString());
	}

}
