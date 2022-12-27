public class Patterns {
    public static void main(String[] args) {
    pattern31(3);
    }

    static void pattern1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i-1 ; l++) {
                System.out.print("* ");
            }
                System.out.println();
        }
        for (int m = 1; m <= 4 ; m++) {
            for (int n = 1; n <= m ; n++) {
                System.out.print(" ");
            }
            for (int o = 0; o <= 4-m ; o++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int originalN = n;
        n = 2*n;
        for (int row = 0; row <= n ; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
