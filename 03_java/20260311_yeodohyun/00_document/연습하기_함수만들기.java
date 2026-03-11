package javaprj.day07;

import java.util.Arrays;

public class 연습하기_함수만들기 {
	
public static void 이번주날씨() {
	
	String [] weather= {"구름많음","맑음","맑음","흐림","맑음","구름많음","맑음"};
	for(int i=1; i<weather.length;i++) {
		System.out.print(weather[i]+" ");		
	}
	
}
public static String[] 이번주날씨2() {
	
	String[] weather={"구름많음","맑음","맑음","흐림","맑음","구름많음","맑음"};
	return weather;
	
}

public static String[] 이번주날씨3(int date) {
	String[] weather={"구름많음","맑음","맑음","흐림","맑음","구름많음","맑음"};	
	String [] result=new String[date];
	
	for(int i=0; i<date; i++) {
	 result[i]=weather[i];
	}
	
	return result;
	}


public static void main(String[] args) {
		
	//	이번주날씨();
	/*
	String[] weekweather = 이번주날씨2();
	//System.out.print(Arrays.toString(weekweather));
	
	for(int i=0; i<weekweather.length; i++) {
		System.out.print(weekweather[i]+" ");
	}
	*/
	
	String[] weekweather=이번주날씨3(2);
	
	for( int i=0; i<weekweather.length; i++) {
		
		System.out.println(weekweather[i]);
	}
}

}
