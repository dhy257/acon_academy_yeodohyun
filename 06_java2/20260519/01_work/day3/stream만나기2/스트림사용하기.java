package day3.stream만나기2;

import java.io.File;
import java.util.stream.Stream;

public class 스트림사용하기 {

	public static void main(String[] args) {
	  	 File[] fileArr = {  new File("Ex.java") , new File( "Ex2.java") , new File("Ex.txt") , new File( "Ex2")} ;
		 Stream<File>  fileStream = Stream.of( fileArr); 
		 fileStream.map( item -> item.getName()).forEach( item -> System.out.println( item));
		 fileStream = Stream.of( fileArr);
		   
		  fileStream.map( item ->  item.getName() )
		  .filter( s-> s.indexOf('.') != -1)
		  .map(  item -> item.substring( item.indexOf('.')+1))
		  .map(  item  -> item.toUpperCase())
		  .distinct()
		  .forEach( item -> System.out.println( item));
		  
		  
				   
		 
		 
	}

}
