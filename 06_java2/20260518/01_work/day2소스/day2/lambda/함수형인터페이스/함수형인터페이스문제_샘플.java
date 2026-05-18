package day2.lambda.함수형인터페이스;


/* 
  AddInterface를 각 3가지 방법으로 구현하고 실행하시오

 1. 이름이 있는 클래스를 만들고 실행하기 
 2. 익명객체를 만들고 실행하기
 3. 람다식으로 만들고 실행하기
 
 
*/

interface AddInterface{
	int add( int su1, int su2);
}


public class 함수형인터페이스문제_샘플 { 
	
	public static void main(String[] args) { 
		
	
		//1.   지역내부클래스 작성
		class  A  implements AddInterface{

			@Override
			public int add(int su1, int su2) {
				 
				return su1-su2;
			}			
		}
		
		
		A  a  = new A();
		int rtn = a.add(5, 1);
		System.out.println( rtn);
		
		
		
		//2.
	    //AddInterface() {};  -> 익명으로 클래스를 정의하는 코드 
		AddInterface  s = new AddInterface() {

			@Override
			public int add(int su1, int su2) {
				 
				return su1-su2;
			}};

		int rtn2  = s.add(7, 2);
		System.out.println( rtn2);
		
		
		//3. 람다식 
		AddInterface   s2 = ( su1, su2 )->{			
			return su1-su2;
		};
		
		int rtn3 = s2.add(4, 2);
		System.out.println( rtn3);
		
		
		AddInterface  s3 = ( su1, su2 ) -> su1-su2;
		int rtn4 = s3.add(8, 1); 
		
		
		// () -> {} ;		
		// 명령줄이 한 개 인겨우  { } 생략, 이 때  return도 생략해야 함
		
		
		
		
		
		
		
		
	}

}
