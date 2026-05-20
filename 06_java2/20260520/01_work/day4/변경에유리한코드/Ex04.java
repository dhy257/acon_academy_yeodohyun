package day4.변경에유리한코드;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ex04 {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		 
		Animal animal = getAnimal();
		animal.bark();		
		
		Animal animal2 = getAnimal();
		animal2.bark();
		
		Animal animal3 = getAnimal();
		animal3.bark();
		
	}

	//매서드에서 직접생성하지 않고 외부의 파일을 읽어서 리플렉션을 통해서 객체를 생성한다.
	//직접 클래스이름을 명시하지 않고 프로그램실행시 읽어온 정보로 동적으로 객체를 생성한다.
	//직접적인 코드의 변경은 일어나지 않는다.	
	//코드에 변화가 생겨도 코드를 직접적으로 변경하지 않도록 설계하고 작성하는 것이 변경에 유리한 코드를 작성하는 방법이다
	private static Animal getAnimal() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {	

		Properties p = new Properties();
		p.load( new FileReader("src/day4/변경에유리한코드/config.txt"));
		String className  =p.getProperty("animal");		
		Class clazz =Class.forName(className);
		Animal animal = (Animal)clazz.newInstance(); 		
		return animal ;
	}

}
