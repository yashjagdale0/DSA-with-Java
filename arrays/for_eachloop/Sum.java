package arrays.for_eachloop;

public class Sum {
    public static void main(String[] args) {
        int []  arr = {3,5,8,6,7,2,4,};
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        System.out.println("Sum of the array is: " + sum);
    }
}
