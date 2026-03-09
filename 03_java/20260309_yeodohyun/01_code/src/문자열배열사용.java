
public class 문자열배열사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] names = new String[5];   // 1차원배열
//		names[0]="장윤성";    // 배열명[인덱스] =값      , 기억장소에 값을 저장
//		names[1]="엄진희";
//		names[2]="이정하";
//		names[3]="정철진";
//		names[4]="김재민";

		 String[] names = {"장윤성", "엄진희", "이정하" , "정철진", "김재민" } ; //배열선언및 초기화
		// String[] names = new String[] {"장윤성", "엄진희", "이정하" , "정철진", "김재민" };
		 
		 for(int i=0;i<names.length;i++) System.out.println(names[i]);
	}

}
