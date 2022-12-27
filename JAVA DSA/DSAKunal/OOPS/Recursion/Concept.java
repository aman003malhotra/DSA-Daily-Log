package DSAKunal.OOPS.Recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        // GIVES THE ERROR AS IT IS A POST DECREMENT FUNCTION
        System.out.println(n);
        fun(n--);
    }
}
