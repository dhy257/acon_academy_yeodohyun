package day1.sort;


//뒤에서부터 정렬 완성됨
public class 버블정렬 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        bubbleSort(arr);

        System.out.println("정렬된 배열:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // 바깥 반복문: 한 번 돌 때마다 마지막 요소가 확정됨
        for (int i = 0; i < n - 1; i++) {
            // 안쪽 반복문: 인접한 요소 비교 및 교환
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 자리 교환 (swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    
    //  64,  25, 12, 22, 11 
    
    // 버블정렬    
  
    // 64   25
    // 25   64 12
    // 25   12 64   22
    // 25    12 22   64   11
    // 25    12 22   11   64        =>1텀 최종상태     
    //=>1텀이 끝남   (마지막 자리 결정 ) :4번 반복
    
    
    //25  12
    //12  25  22
    //12  22  25  11
    //12  22  11  25    =>2텀  최종상태
    
    //=>2텀 끝남  (마지막자리 결정)   :3번 반복
    
    
    
    
    
    
    //12 22 
    //12 22 11
    //12 11 22     =>3텀  2번반복   
    
    
    //12 11        =>1번 반복
    //11 12 22
    
    
    //11  12  22  25  54 
    
    
    
}
