package javaprj.day05;

public class 배열실습_박세인 {

	public static void main(String[] args) {
		
		System.out.println("-----1차원 배열(동물)-----");
		String[] 동물 = new String[5];
		동물[0] = "강아지";
		동물[1] = "고양이";
		동물[2] = "독수리";
		동물[3] = "호랑이";
		동물[4] = "쿼카";
		
		System.out.print(동물[0]);
		System.out.print(동물[1]);
		System.out.print(동물[2]);
		System.out.print(동물[3]);
		System.out.println(동물[4]);
		
		
		System.out.println("-----1차원 반복문-----");
		for(int i=0; i<5; i++) {
			System.out.print(동물[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		
		//2차원배열
		System.out.println("-----2차원 배열(메뉴)-----");
		
		String [][] menus = {
				{"파스타", "라멘", "짬뽕", "짜장면"},
				{"국밥", "덮밥", "밥", "짜장밥"},
				{"돈까스", "치돈", "새우튀김", "김말이"}
		};
		System.out.print(menus[0][0]);
		System.out.print(menus[0][1]);
		System.out.print(menus[0][2]);
		System.out.println(menus[0][3]);
		System.out.print(menus[1][0]);
		System.out.print(menus[1][1]);
		System.out.print(menus[1][2]);
		System.out.println(menus[1][3]);
		System.out.print(menus[2][0]);
		System.out.print(menus[2][1]);
		System.out.print(menus[2][2]);
		System.out.println(menus[2][3]);
		
		
		System.out.print("-----2차원 반복문-----");
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<4; j++) {
			System.out.print(menus[i][j]+" ");
			}
		}
		System.out.println();
		
		
		//3차원배열
		System.out.println("\n" + "-----3차원 배열(이름)-----");
		String [][][] names= {
				{
					{"서준", "민준", "도윤","시우","우진"},
					{"주원", "지호", "하준", "예준","현우"},
					{"도현", "준우", "준서", "건우","선우"}
				},
				
				{
					{"서윤","서연","지우","하윤","서현"},
					{"하은","민서","지유","윤서","수아"},	
					{"채원","지아","지민","서아","지안"}
				}
		};
		
		System.out.print(names[0][0][0]);
		System.out.print(names[0][0][2]);
		System.out.print(names[0][0][3]);
		System.out.println(names[0][0][4]);
		System.out.print(names[0][1][0]);
		System.out.print(names[0][1][2]);
		System.out.print(names[0][01][3]);
		System.out.println(names[0][1][4]);
		System.out.print(names[0][2][0]);
		System.out.print(names[0][2][2]);
		System.out.print(names[0][2][3]);
		System.out.println(names[0][2][4]);
		
		System.out.print(names[1][0][0]);
		System.out.print(names[1][0][2]);
		System.out.print(names[1][0][3]);
		System.out.println(names[1][0][4]);
		System.out.print(names[1][1][0]);
		System.out.print(names[1][1][2]);
		System.out.print(names[1][01][3]);
		System.out.println(names[1][1][4]);
		System.out.print(names[1][2][0]);
		System.out.print(names[1][2][2]);
		System.out.print(names[1][2][3]);
		System.out.println(names[1][2][4]);
		
		
		System.out.print("-----3차원 반복문-----" + "\n");
		for(int k=0; k<2; k++) {
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(names[k][i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
	}

}
