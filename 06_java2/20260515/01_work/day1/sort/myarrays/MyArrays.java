package day1.sort.myarrays;



interface MyComparable {
    int compareTo( Object other); // 기준이 크면 양수, 작으면 음수 같으면 0
}

interface MyComparator {
    int compare(Object  o1, Object o2);
}


public class MyArrays {

 
    public static   void sort(Object[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
               
            	
                if ( ((MyComparable)arr[i]).compareTo(arr[j]) > 0) {
                   
                    Object tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    
    public static   void sort(Object[] arr, MyComparator  comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
             
                if (comparator.compare(arr[i], arr[j]) > 0) {                   
                    Object tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
