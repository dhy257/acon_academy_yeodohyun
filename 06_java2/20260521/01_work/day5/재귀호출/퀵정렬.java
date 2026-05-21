package day5.재귀호출;

public class 퀵정렬 {
    // 퀵정렬 메서드
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // 파티션 인덱스를 구하고 재귀 호출
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);  // 피벗보다 작은 요소 정렬
            quickSort(array, pi + 1, high); // 피벗보다 큰 요소 정렬
        }
    }
    
    
    

    // 파티션 메서드
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // 마지막 요소를 피벗으로 선택
        int i = (low - 1); // 피벗보다 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같은 경우
            if (array[j] <= pivot) {
                i++;
                // 요소 교환
                swap(array, i, j);
            }
        }
        // 피벗을 올바른 위치로 교환
        swap(array, i + 1, high);
        return i + 1; // 피벗의 최종 위치 반환
    }

    // 배열의 두 요소를 교환하는 메서드
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 메인 메서드
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("원본 배열:");
        printArray(array);

        quickSort(array, 0, n - 1); // 퀵정렬 호출

        System.out.println("정렬된 배열:");
        printArray(array);
    }

    // 배열 출력 메서드
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
