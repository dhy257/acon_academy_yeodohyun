package day1.sort;

public class 개선된선택정렬 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);

        System.out.println("정렬된 배열:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // 현재 위치(i)에서 가장 작은 값의 인덱스를 찾음
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if ( arr[minIndex]  >  arr[j] ) {
                     minIndex = j;
                }
            }

            // 찾은 최소값을 현재 위치(i)와 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
