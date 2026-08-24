package if_else;

public class SmallestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;
        if (a <= b && a <= c) {
            System.out.println(a + " is Smallest");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is Smallest");
        } else {
            System.out.println(c + " is Smallest");
        }
    }
}
