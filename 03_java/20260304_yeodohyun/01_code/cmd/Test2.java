import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
	//입력
	String name;
	int kor, eng, math;
	
	//출력 변수
	double avg; //개인평균
	String grade; //개인평가
	double avgKor, avgEng, avgMat;

	//처리
	int totalKor=0, totalEng=0, totalMat = 0; //과목별 합계 점수

	//상수
	final int MAX=3;
	/*
	처리과정 
   
   	1. 반복
      		1.1  학생성적 입력 (이름 국어 영어 수학)
      		1.2  학생평균 구하기
      		1.3  과목별 점수 누적하기
      		1.4  학생평가구하기 
      		1.5  학생개인성적 출력하기 
   	2. 과목별평균구하기
   	3. 과목별평균 출력
   	4.종료
	*/
	Scanner sc = new Scanner(System.in);
	for(int i=1;i<=MAX;i++){
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		avg = (kor+eng+math) / 3.0;

		totalKor+=kor;
		totalEng += eng;
		totalMat += math;

		if(avg>=90){
			grade="Excellent";
			}
		else if(avg<60){
			grade="Fail";
			}
		else{
			grade="";
			}
		System.out.println(name+kor+" "+eng+" "+math+grade);

		}
		avgKor = totalKor / MAX;
		avgEng = totalEng / MAX;
		avgMat = totalMat / MAX;
		System.out.println(avgKor);
		System.out.println(avgEng);
		System.out.println(avgMat);
		
	}

}