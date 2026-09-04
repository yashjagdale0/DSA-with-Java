package arrays;

public class SwapMinMaxValue {
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 9, 2};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
