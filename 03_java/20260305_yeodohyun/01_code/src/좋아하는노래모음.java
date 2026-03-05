

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 좋아하는노래모음 {
	
	 public static void main(String[] args) {
		
		 
		 //우리반 학생들이 좋아하는 음악정보를 저장하고 사용하려고 한다//
		 //21명 학생들의 노래 정보를 어떻게 저장하는게 꺼내서 사용하기 편리한가? 
		 
		 //배열 
		 
		 // 0        1        2
		 //벌써일년  바람의노래   학교종   ...
		 
		 
		 
		 //map => 키, 값 형태로 저장 
		 
		 
		 Scanner sc  = new Scanner (System.in);
		 
		 HashMap<String, String> songs= new HashMap<>();		 
		 songs.put("우주연", "벌써1년");
		 songs.put("김태준", "널위한멜로디");
		 songs.put("여도현","merry christmas mr lawrence");
		 songs.put("김재민", "LETTER");
		 songs.put("손영석", "역성");
		 songs.put("이현겸", "The Sound");
		 songs.put("박세인", "0+0");
		 songs.put("나해수", "Touch Love");
		 songs.put("장해든", "Massive");
		 songs.put("김민경", "생존법");
		 songs.put("고지연","숲");
		 songs.put("황스일", "Nothin' But A Good Time");
		 songs.put("정철진", "off my face");
		 songs.put("엄진희", "yesterday");
		 songs.put("송주창", "하얀그리움");
		 songs.put("이용찬", "가을아침");
		 songs.put("장윤성", "Passionfruit");
		 songs.put("김건희","surf(wave to earth)");
		 
		 
		 
		 
		 
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
		 System.out.println( randomKey);
		 System.out.println( randomSong);
		 
		 
		 
		 
		 
		 
		 
	}

}
