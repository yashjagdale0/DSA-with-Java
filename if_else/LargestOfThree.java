package if_else;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;
        if (a >= b && a >= c) {
            System.out.println(a + " is Largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is Largest");
        } else {
            System.out.println(c + " is Largest");
        }
    }
}
