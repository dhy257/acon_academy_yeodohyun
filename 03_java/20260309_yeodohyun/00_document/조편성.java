package javaprj.day05;

import java.util.Random;

public class 조편성 {
    public static void main(String[] args) {
    	
    	
    	/*
    	 *  입력:x
    	 *  출력: 조편성 2차원배열  arr(5)(4)
    	 *  준비: 1차원이름배열  : name(20)    	 
    	 * 
    	 * 
    	 */
    	

        String[] names = {
                "김건희","고지연","김민정","황스일","이현겸",
                "이용찬","여도현","장해든","박세인","나해수",
                "손영석","송주창","정철진","김재민","엄진희",
                "이정하","김민경","조아진","장윤성","김태준"
        };
        
        
         

        Random r = new Random();

        // 1차원 배열 섞기
        for(int i=0; i<names.length; i++) {
            int j = r.nextInt(names.length);//20이내의 랜덤값 뽑아준다 0~19사이의 

            
            //i,j 번째 교환 무작위로 교환해서 섞어주기
            String temp = names[i];
            names[i] = names[j];
            names[j] = temp;
        }

        
        // 5행 4열 배열
        String[][] arr = new String[5][4];

    
        int 열의개수=4;  // 한 줄에 4개씩 두겠다
        for( int i=0; i< names.length; i++) {        	
        	//행 열 계산
        	int row= i/ 열의개수;     // 열의 개수로 나눈 몫이 행으로 사용된다
        	int col  = i% 열의개수;   // 열의 개수로 나눈 나머지가 열로 사용된다
        	arr[row][col]=  names[i];
        	
        }
        
        /*
         *  // 열의 개수로 나눈 몫이 행으로 사용된다
         *  // 열의 개수로 나눈 나머지가 열로 사용된다
         *  
         *  //행과 열이 만들어지고 있네요 ~~
         *  
         *    i=0 ,1 ,2,3
         *    0000 행
         *    0123 열
         *    
         *    i=4,5,6,7
         *    1111 행
         *    0123 열
         *    
         *    i=8,9,10,11
         *    2222 행
         *    0123 열
         *    
         *    i=12,13,14,15
         *    3333 행
         *    0123 열
         *    
         *    i=16,17,18,19
         *    4444 행
         *    0123 열  
         *    
         * 
         * 
         */
        
        /*
         * 
        이 방법을 사용해됨 =>1차원배열 20개나  2차원배열 5*4 =20 같음
        
        int index = 0; 
        for(int i=0;i<5;i++) {
            for(int j=0;j<4;j++) {
                arr[i][j] = names[index++];
            }
        }
       */
        
        

        // 출력
        System.out.println(" 조 출력 :   재미있게 해 줘요");        
        for(int i=0;i<5;i++) {   //행
        	System.out.println(i+1 +"조  ^^ " );
            for(int j=0;j<4;j++) {   //열
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        String[] title = {"생성자",  "this", "오버라이딩", "업캐스팅", "다운캐스팅"};
        //                false    false    false     false     false       
        boolean[] used = new boolean[title.length];
 

        
        //첫번째 조 부터 조이름 뽑아오기
        for (int i = 0; i < 5; i++) {
            int idx;
            while (true) {
                idx = r.nextInt(title.length);

                if (!used[idx]) {   // 아직 사용 안했으면
                    used[idx] = true;
                    break;
                }
            }

            System.out.println((i + 1) + "조 : " + title[idx]);
        }
        
        
        /*
         * 
         * 
         * 
         * 
		   * SEUIL 5:04 PM
			황스일 : 생성자
			
			여도현 5:05 PM
			여도현-생성자
			
			박세인 5:05 PM
			이현겸: this
			
			Jiyoun Ko 5:05 PM
			고지연: this
			
			엄진희 5:05 PM
			엄진희 업캐스팅
			김재민 업캐스팅
			
			김민정 5:06 PM
			박세인 : this
			
			아진 조 5:06 PM
			조아진 : this
			
			이용찬 5:07 PM
			이용찬: 오버라이딩
			
			나해수 5:07 PM
			업캐스팅
			
			이정하 this
			
			송주창 생성자
			
			
			정철진 5:14 PM
			정철진 다운캐스팅
			
			Deuni 5:30 PM
			장해든 : 업캐스팅
						
			손영석 - this
			
						
			김민경 - 오버라이딩
			
			
			김민정-업캐스팅
			
			
			김건희:생성자
			
			
			장윤성 - 업캐스팅
			
			
			
			         * 
         * 
         * 
         * 
         * 
         * 
         */
         
    }
}