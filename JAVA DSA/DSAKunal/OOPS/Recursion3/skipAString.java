package DSAKunal.OOPS.Recursion3;

public class skipAString {
    public static void main(String[] args) {
        System.out.println(skipString("asdkjvbdappledsjk"));
    }   

    public static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }else{
            return ch + skipString(up.substring(1));
        }
    }
}
