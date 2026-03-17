package javaprj.day11.상속맛보기.상속.춤추기;

public class 에이콘학생춤추기 {

	public static void main(String[] args) {
		
		
		Acorn []  list  = new Acorn[7];
		 list[0]= new WJY(); //에이콘학생 춤춰		 
		list[1]= new HSI();
		list[2]= new JcJ();
		list[3]= new KJY();
		list[4]= new LHK();
		list[5]= new LJH();
		list[6]= new SJC();
		
		
		for(int i=0; i< list.length;i++) {
			list[i].dance();
		}
		 
		
		
		

	}

}
