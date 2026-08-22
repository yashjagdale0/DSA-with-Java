package aritametic;

public class Test {
    public static void main(String[] args) 
 {
    Calculate obj  =  new Calculate() {
        public int findSquare(int n) {
            return n*n;
        }
    };
    int result = obj.findSquare(5);
    System.out.println("Square of 5 is: " + result);
 }
    
}

interface Calculate{
    int findSquare(int n);
}



