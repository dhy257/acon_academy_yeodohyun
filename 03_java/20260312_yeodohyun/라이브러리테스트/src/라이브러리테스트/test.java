package 라이브러리테스트;

import com.acorn.dhy.MyLib;
import com.acorn.dhy.Mylib2;
import com.acorn.lhk.MyLibLHK;
import com.acorn.wjy.Cute;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MyLib.오늘의운세());

		Mylib2.printWeather(Mylib2.week_weather());
		System.out.println(Cute.귀여운이모지얻기());
		MyLibLHK.응원메시지출력();
		
		
		
		
	}

}
