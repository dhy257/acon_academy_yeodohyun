package 추상클래스;

public class AcornStudentMgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AcornStudent[] list  = new AcornStudent[20];
		
		list[0]= new 김건희( );  //
		list[1]= new 고지연();
		list[2]= new 황스일();
		list[3]= new 김민정();
		list[4]= new 이현겸();
		list[5]= new 이용찬();
		list[6]= new 여도현();
		list[7]= new 나해수();
		list[8]= new 손영석();
		list[9]= new 송주창();
		list[10]= new 김민경();
		list[11]= new 정철진();
		list[12]= new 김재민();
		list[13]= new 조아진();
		list[14]= new 박세인();
		list[15]= new 이정하();
		list[16]= new 엄진희();
		//list[17]= new 장윤성();
 
		
		//하나의 메시지 (매서드 호출) 에  각자 고유의 동작이 나오게 하기
		
		for( int i =0 ; i < 17; i++) {
			list[i].공부한다();
			list[i].춤추기();
		}
		 
		 
		

	}

}
