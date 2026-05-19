package day3.stream만나기2;

import java.io.File;
import java.util.stream.Stream;

public class Map중간연산 {
	
	

	public static void main(String[] args) {
	
		/*
		 * 
		 * 변환 - map()
		 * : 스트림요소에 지정된 값 중에서 원하는 필드만 뽑아내거나 특정형태로 변환할 때 사용한다 
		 * File스트림에서 파일의 이름만  뽑아서 출력할때 사용할 수 있다
		 * 
		 */
		
		
		//1.File형 배열 생성
		 File[] fileArr = {  new File("돈까스.jpg") , new File( "오므라이스.png") , new File( "등갈비.jpg" ), new File( "굽네치키.jpg") } ;
		 
		 //2.
		 Stream<File>  fileStream = Stream.of( fileArr); 
		 
		 Stream <String>  strList =  fileStream.map( item -> item.getName());
		 strList.forEach( item -> System.out.println( item));

	 	  
				   
		 
		 
	}

}
