package arrays;

public class FirstEvenOdd {
    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (arr[0] % 2 == 0){
            System.out.println("First element is even");
        } else {
            System.out.println("First element is odd");
        }
    }
}
