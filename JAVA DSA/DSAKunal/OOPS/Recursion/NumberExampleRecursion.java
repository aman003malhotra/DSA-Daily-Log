package DSAKunal.OOPS.Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n){
        // BASE CONDITION
        if(n == 5){
            return;
        }
        System.out.println(n);
        print(n+1);// recursive call
    }
}
