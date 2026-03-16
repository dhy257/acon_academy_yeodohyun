package javaprj.day10.학생;

public class AcornStudent장해든Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AcornStudent장해든 클래스를 가지고  에이콘학생정보를 저장할 수 있는 변수 만들ㅇ기
		AcornStudent장해든   s  = new AcornStudent장해든();
		
		s.입력하기("장해든", 1000, 30, 30, 100, 100);
		
		//객체 매서드 사용하는 방법
		// 객체를 반드시 생성해야 한다
		// 왜냐면 객체의 정보를 전달받아서 객체( 즉 변수)의 내용을 사용해야 한다
		s.정보출력하기();		
		s.놀기놀기();   // => 객체의 행복지수는 놀기놀기()를 사용해서 올릴 수 있다.
		s.정보출력하기();
		//s.행복지수 =50000;   => 변수를 사용하는게 아니라 놀기놀기() 를 통해서 행복지수의 값을 변화시키는 것 
		
		
		//학원정보 출력하기
		AcornStudent장해든.학원위치소개하기();  

	}

}
