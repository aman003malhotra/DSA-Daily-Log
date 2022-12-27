package CodingNinja.Recursion;

public class NumberofDigits {
    static int count  = 0;

    public static int coutDigit(int n) {
        count ++;
        if(n < 10){
            return 1;
        }
        n = n/10;
        coutDigit(n);
        return count;

    }
}
