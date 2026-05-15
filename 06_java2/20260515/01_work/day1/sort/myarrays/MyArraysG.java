package day1.sort.myarrays;

//제네릭 버전은 참고만 하세요 !


interface MyComparableG<T> {
    int compareTo(T other); // 기준이 크면 양수, 작으면 음수 같으면 0
}

interface MyComparatorG<T> {
    int compare(T o1, T o2);
}



public class MyArraysG {

	
	//T는 반드시 MyComparableG 인터페이스를 구현한 클래스여야 한다
 
    public static <T extends MyComparableG > void sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               
                if (arr[i].compareTo(arr[j]) > 0) {
                    // Swap
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    
    public static <T> void sort(T[] arr, MyComparatorG< T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
             
                if (comparator.compare(arr[i], arr[j]) > 0) {
                   
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
