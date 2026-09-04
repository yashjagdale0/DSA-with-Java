package arrays;

public class ArrayContainsZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,0};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Array contains zero.");
        } else {
            System.out.println("Array does not contain zero.");
        }
    }
}
