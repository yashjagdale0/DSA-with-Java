package arrays;

public class SwapEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenIndex = 0;
        int oddIndex = 0;
        for  (int i = 0; i < arr.length; i++) {
            while (arr[i] % 2 != 0) {
                evenIndex = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            while (arr[i] % 2 == 0) {
                oddIndex = i;
                break;
            }
        }
        int temp = arr[evenIndex];
        arr[evenIndex] = arr[oddIndex];
        arr[oddIndex] = temp;
        System.out.println("Array after swapping first even and last odd elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
