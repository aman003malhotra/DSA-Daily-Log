package DSAKunal.OOPS.Recursion;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        if(n < 2){
            return 1;
        }
        return n * factorial(n-1);

    }
}
