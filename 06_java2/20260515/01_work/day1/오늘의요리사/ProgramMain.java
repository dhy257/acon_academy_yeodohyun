 package day1.오늘의요리사;

import java.util.ArrayList;

public class ProgramMain {

	public static void main(String[] args) { 
	 

		//Cook형을 담을 수 있는 ArrayList를 준비한다
		ArrayList<Cook> list = new ArrayList<Cook>();
		                             
		// Cook을 상속받았으므로 각 각의 요리사 클래스를 담을 수 있다
		list.add(new SampleCook1("안성재"));
		list.add(new SampleCook2("백종원"));
		list.add(new SampleCook3("이연복"));
  
		

		// 요리사별로 ArrayList 준비하기
		ArrayList<한식가능한> 한식요리사 = new ArrayList<한식가능한>();
		ArrayList<중식가능한> 중식요리사 = new ArrayList<중식가능한>();
		ArrayList<일식가능한> 일식요리사 = new ArrayList<일식가능한>();

		
		// 요리사종류별로 목록을 구성한다.
		for (Cook cook : list) {
			if (cook instanceof 한식가능한) {
				한식요리사.add((한식가능한) cook);
			} else if (cook instanceof 중식가능한) {
				중식요리사.add((중식가능한) cook);
			} else if (cook instanceof 일식가능한) {
				일식요리사.add((일식가능한) cook);
			}
		}

		System.out.println("--한식 요리사 입니다--");
		System.out.println(한식요리사);

		System.out.println("--중식 요리사 입니다--");
		System.out.println(중식요리사);

		System.out.println("--양식 요리사 입니다--");
		System.out.println(일식요리사);

		
		// 랜덤한 값 얻어오기
		int random = (int) (Math.random() * 3); // 0~2; 
		
		
		//선택한 요리사종류 출력하기
		String[] kinds = { "한식가능한", "중식가능한", "일식가능한" };
		String selectedKind = kinds[random];
		System.out.println("==========>선택된 요리사 kind  ====>" + selectedKind);

		 
		//선택된 요리사종류  중에서 한 명의 요리사 선택하기 
		int randomRange = 0;
		int finalOne;
		Cook finalCook = null;

		switch (selectedKind) {
		case "한식가능한":
			 
			randomRange = 한식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			finalCook = (Cook) 한식요리사.get(finalOne);
		
			break;

		case "중식가능한":
			 
			randomRange = 중식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			finalCook = (Cook) 중식요리사.get(finalOne);
			 
			break;

		case "일식가능한":			 
			randomRange = 일식요리사.size();
			System.out.println("randomRange="+ randomRange);
			finalOne = (int) (Math.random() * randomRange);
			finalCook = (Cook) 일식요리사.get(finalOne);			 
			break;
		}
		
			
	
		
		try {
			Thread.sleep(20000);  // 1000 =>1초
			
			System.out.println("====>최종선발   축하합니다  😄 🎉🎉🎉  ");
			System.out.println(finalCook);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		 

	}

}
