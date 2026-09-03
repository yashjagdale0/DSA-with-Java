package arrays.for_eachloop;

public class EvenAndOdd {
    public static void main(String[] args) {
        int []  arr = {3,5,8,6,7,2,4,};
        for(int x : arr){
            if(x % 2 == 0){
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
        }
    }
}
