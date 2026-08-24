package if_else;

public class UppercaseLowercase {
    public static void main(String[] args) {
        char ch = 'Y';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Not an Alphabet");
        }
    }
}
