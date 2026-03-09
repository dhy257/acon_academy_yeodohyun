package Day0309;

public class 배열문제2_1_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
		
		//이번주 날씨 정보를 출력하시오 
		for(int i = 0; i<Temperatures.length;i++) {
			System.out.print((i+1) + "일 이번주 날씨");
			System.out.println(Temperatures[i] + " ");
		}
		
		//평균온도를 구하시오
		int sum = 0;
		double avg;
		for(int i = 0; i< Temperatures.length; i++) {
			sum = sum + Temperatures[i];
		}
		avg = sum/(double)Temperatures.length;
		System.out.println("날씨 평균입니다");
		System.out.println(avg);
		
		//35도가 넘는 날의 횟수를 구하시오
		int number = 0;
		for(int i = 0; i< Temperatures.length;i++) {
			if(Temperatures[i]>35) {
				number++;
			}
		}
		System.out.println("35도 넘는 날의 횟수를 구하시오");
		System.out.println(number + "개");
		
		//가장 높은 온도를 구하시오.
		int max = Temperatures[0];
		for(int i =0; i<Temperatures.length; i++) {
			if(Temperatures[i]>max) {
				max = Temperatures[i];
			}
		}
		System.out.println(max + "높은 온도");
	}

}
