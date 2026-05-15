package day1.sort;

public class 선택정렬 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        
        /*
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {        
            
            for (int j = i + 1; j < n; j++) {
            	
                if (arr[i] > arr[j]) {
                	 int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                  
                }
            }
 
        }
         
         */
        selectionSort(arr);

        System.out.println("정렬된 배열:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
    
    

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {            
            
            for (int j = i + 1; j < n; j++) {
            	
                if (arr[i] > arr[j]) {
                	 int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                  
                }
            }
 
        }
    }
}
