package DSAKunal.OOPS.Recursion;

public class PatternProblemRecursion {
    public static void main(String[] args) {
    pattern1(4,4);
    }
    static void pattern1(int r, int c){
//        int newC = c;
        if(c > 0) {
            System.out.print("* ");
            pattern1(r, c-1);
            return;
        }
        if(r >= 2 ) {
            System.out.println();
            pattern1(r - 1, r - 1);
        }
        return;
    }
}
