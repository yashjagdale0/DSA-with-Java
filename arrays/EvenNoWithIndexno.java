package arrays;

public class EvenNoWithIndexno {
    public static void main(String[] args) {
        int []  arr = {3,5,8,6,7,2,4,};
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i] + " is even and its index is: " + i);
            }
        }
    }
}
