package day1prac.myarrays;

import java.util.Arrays;

// 정렬하기

public class 선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//
		int[] kors = {90,80,55,78};
		String[] names = {"장해든","박세인","김건희"};
		
		// 왼쪽부터 정렬이 완성됨
		for(int i=0;i<kors.length-1;i++) { // 기준
			for(int j=0;j<kors.length;j++) { // 비교
				if(kors[i]>kors[j]) { // 오름차순
					// 반드시 임시변수 필요함
					int tmp;
					tmp = kors[i];
					kors[i]=kors[j];
					kors[j]=tmp;
				}
			}
		}
		
		//
		System.out.println(Arrays.toString(kors));
		
		//
		for(int i=0;i<names.length-1;i++) { // 기준
			for(int j=0;j<names.length;j++) { // 비교
				
				// 기준		비교
				// 문자열.compareTo(문자열)
				if(names[i].compareTo(names[j])>0) { // 기준이 크면 양수, 기준이 작으면 음수
					// 반드시 임시변수 필요함
					String tmp;
					tmp = names[i];
					names[i]=names[j];
					names[j]=tmp;
				}
			}
		}
		
		//
		System.out.println(Arrays.toString(names));
		
	}

}
