package day3.stream.맛보기;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 문자열리스트스트림사용하기 {

	public static void main(String[] args) {
		ArrayList<String> list1  = new ArrayList<>();
		list1.add("딸기");
		list1.add("딸기");
		list1.add("딸기");
		list1.add("포도"); 
		
		Stream<String>  stream = list1.stream(); 
		//List<String > li= stream.sorted().filter( item -> item.equals("딸기")).collect( Collectors.toList());   //이전  
		List<String > li= stream.sorted().filter( item -> item.equals("딸기")).toList();  //자바16이상
		System.out.println(li);

	}

}
