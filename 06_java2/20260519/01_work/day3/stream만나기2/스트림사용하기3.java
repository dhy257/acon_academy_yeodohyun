package day3.stream만나기2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class 스트림사용하기3 {

	public static void main(String[] args) {
	 
		ArrayList< Score> list = new ArrayList<>();
		list.add( new Score("김길동",1,100));
		list.add( new Score("김길동",1,100));
		list.add( new Score("김길동",1,100));
		list.add( new Score("김길동",1,100));
		list.add( new Score("김길동",1,100));
		list.add( new Score("김길동",1,60));
		list.add( new Score("김길동",1,100));
		
		
		Stream<Score> str = list.stream ( );
		//str.filter( t -> t.getKor()<=60).forEach( t -> System.out.println(t));
		
		
		
		//익명으로 구현 
		str = list.stream ( );
		str.filter( new Predicate<Score>() {

			@Override
			public boolean test(Score t) {
				boolean r  = (t.getKor()<=60)?true:false;
				return r;
			}
		}).forEach( new Consumer<Score>() {

			@Override
			public void accept(Score t) {
				System.out.println(t);
			}
			
		});
	}

}
