import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 좋아하는노래모음 {
	
	 public static void main(String[] args) {
		
		 
		 Scanner sc  = new Scanner (System.in);
		 
		 HashMap<String, String> songs= new HashMap<>();		 
		 songs.put("우주연", "벌써1년");
		 
		 
		 //String resultSong  = songs.get("우주연");		 
		// System.out.println( resultSong);
		 
		 System.out.println("이름을 입력하시오");
		 String name = sc.nextLine();
		 String nameSong  = songs.get(name);		 
		 System.out.println( nameSong);
		 
		 //랜덤하게 꺼내기
		 //키만 배열에 담기 ( ArrayList 는 배열 비슷한거  , 배열을 편리하게 사용하게 하는것)  
		 ArrayList<String> keys  =  new ArrayList<>(songs.keySet()) ;		 
		 int randomIndex   = (int) (Math.random() * keys.size());
		 String randomKey   = keys.get(randomIndex);	 
		 
		 String randomSong  = songs.get(randomKey);		 
		 System.out.println( randomSong);
		 
	}

}