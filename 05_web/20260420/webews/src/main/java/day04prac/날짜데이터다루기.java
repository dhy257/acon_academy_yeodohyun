package day04prac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 날짜데이터다루기 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String id = "hee";
		String pw = "1234";
		String name = "김건희";
		int point = 5000;
		Date birth = null;
		
		// "문자열" => Date
		// "2002-10-10"
		String strBirth =  "2002-10-*&10ㅇddㅇ";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
		
		try {
			sf.parse(strBirth);
		} catch (ParseException e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println("날짜 형식이 맞지 않음");
			// 예외 다시 일으키기
			throw e;
		}
		
		System.out.println("정상종료");
		
	}

}
