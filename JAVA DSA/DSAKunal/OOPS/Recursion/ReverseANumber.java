package DSAKunal.OOPS.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
//        System.out.println(countOfDigit(12345));
//        int newCount = countOfDigit(12345);
        System.out.println(reverse(1234));
    }
    int count = 0;
    static int countOfDigit(int n){
        if (n<10){
           return  1;
        }
        return 1+countOfDigit(n/10);
    }

    static int reverse(int n){
        if(n < 10){
            return n;
        }
        int y = (n%10)*10;
        int x =  y + reverse(n/10);
        return x;
    }
}
