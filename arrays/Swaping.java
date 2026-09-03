package arrays;

public class Swaping {
    public static void main(String[] args) {
        int []  arr = {3,5,8,6,7,2,4,};
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        for(int x : arr){
            System.out.print(x);
        }
    }
}
