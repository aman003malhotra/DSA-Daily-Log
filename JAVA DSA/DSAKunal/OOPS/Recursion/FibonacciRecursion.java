package DSAKunal.OOPS.Recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(fibonacciRecursion(6));
    }
    static int fibonacciRecursion(int n){
        if(n < 2){
            return n;
        }

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
}
