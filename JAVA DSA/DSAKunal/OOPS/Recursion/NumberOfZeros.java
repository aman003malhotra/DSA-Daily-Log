package DSAKunal.OOPS.Recursion;

public class NumberOfZeros {
    public static void main(String[] args) {
        System.out.println(num(20405670));
    }
    static int num(int n){
        if(n == 0){
            return 0;
        }
        if(n%10 == 0){
            return 1 + num(n/10);

        }
        return num(n/10);

    }
}
