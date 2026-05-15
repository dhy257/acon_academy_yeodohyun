package day1.sort.myarrays;

public class ScoreTest2 {

	public static void main(String[] args) {
		 
		
		Score2[] list = new Score2[4];
		               //   국어  영어
		list[0]= new Score2(100,90);
		list[1]= new Score2(80,99);
		list[2]= new Score2(99,87);
		list[3]= new Score2(70,60);		
		
		
		//객체배열 출력	
		
		for( Score2  score: list) {
			System.out.println( score);
		}
		
		
		//국어점수가 낮은 순으로 정렬 ( 직접정렬 , 선택정렬) 		                                         //  0  1  2  3
		
		for( int i=0 ; i< list.length-1 ;  i++) {  // i=0
			for( int j=i+1; j< list.length ; j++) { // j=1 , 2 ,3 
				  if( list[i].kor  > list[j].kor) {
					   Score2 tmp;
					   tmp = list[i];
					   list[i]=list[j];
					   list[j]=tmp;	  
					   
				  }
			}
		}
		
		System.out.println("=국어====>");

		for( Score2  score: list) {
			System.out.println( score);
		}
		
		
		
		MyArraysG.sort(list);	
		
		System.out.println("=영어====>");

		for( Score2  score: list) {
			System.out.println( score);
		}
		
		
		
		
		
		MyArraysG.sort( list, new MyComparatorG<>() {

			@Override
			public int compare(Score2 o1, Score2 o2) {
				// TODO Auto-generated method stub
				return  o2.getKor() -o1.getKor();
			}});

		
		System.out.println("=국어 점수 높은순====>");

		for( Score2  score: list) {
			System.out.println( score);
		}
		
		//
		
		MyArraysG.sort(list);		
	}

}
