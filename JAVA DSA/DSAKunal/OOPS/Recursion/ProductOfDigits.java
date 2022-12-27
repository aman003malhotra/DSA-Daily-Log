package DSAKunal.OOPS.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
    static int sum(int n){
        if(n<10){
            return n;
        }
        return n%10 * sum(n/10);
    }
}
