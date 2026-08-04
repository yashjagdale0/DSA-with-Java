import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
