package day5.di_injection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		/*
		Phone phone = new Phone();		
		//폰에 베터리를 주입하는 코드		 
	    // phone.setBettery( new LGBettery());	
		phone.setBettery( new SMBettery());		
		phone.powerOn();
		
		
		//
		//LGBettery , SMBettery 이 정보를 외부설정파일로 작성해 두겠다.
		//Class.forName()클래스정보를 읽은 다음에 동적으로 객체를 생성해서 사용하겠다.	
		// 변경
		*/
		
		
		
		
		Phone phone2 = new Phone();			
		Properties p = new Properties();
		p.load( new FileReader("src/day5/di_injection/config.txt"));
		String className  =  p.getProperty("Bettery");
		
		
		//클래스정보를 로드한다
		Class clazz  = Class.forName(className);
		Bettery  bettery  = (Bettery) clazz.newInstance();
		 
		
		//쎄터 주입 
		phone2.setBettery(bettery);		
		phone2.powerOn();
		
		
		
		
	}

}
