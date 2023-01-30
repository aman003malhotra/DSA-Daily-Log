package DSAKunal.OOPS.Recursion3;

import java.util.ArrayList;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        System.out.println(pad("", "12"));
    }

    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> left = new ArrayList<String>() ; 

        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i <digit*3 ; i++){
            char ch = (char) ('a' + i);
            left.addAll(pad(p+ch, up.substring(1)));
        }
        return left;

    }
}
