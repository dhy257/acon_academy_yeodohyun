package day3.stream만나기2;

import java.io.File;
import java.util.stream.Stream;

public class Map중간연산3 {
	
	

	public static void main(String[] args) {
	
		/*
		 * 
		 * 변환 - map()
		 * : 스트림요소에 지정된 값 중에서 원하는 필드만 뽑아내거나 특정형태로 변환할 때 사용한다 
		 * File스트림에서 파일의 이름만 쫍아서 출력할때 사용할 수 있다
		 * 
		 */
		
		

		 File[] fileArr = {  new File("돈까스.jpg") , new File( "오므라이스.png") , new File( "등갈비.jpg" ), new File( "굽네치키.jpg") } ;
 		 Stream<File>  fileStream = Stream.of( fileArr); 	 
		 fileStream.map( item ->  item.getName() )
		 .map(  item -> item.substring(   item.indexOf('.')+1))
		 .forEach( item -> System.out.println( item));
		 
		
		 
		 
		 
		 
		 	  
		  
		  
				   
		 
		 
	}

}
