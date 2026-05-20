package day4.변경에유리한코드;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {	
		/*key=value 형태의 데이터를 쉽게 읽어오기 위해 제공되는 클래스이다 .
		 *파일을 직접읽어서 사용하는 것보다 좀 더 편리함
		 *
		 * key = value (클래스정보 )*/
		
		try {
			Properties  p = new Properties();	
			p.load( new FileReader("src/day4/변경에유리한코드/config.txt"));			
			String name  = p.getProperty("animal");
			System.out.println( name);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
