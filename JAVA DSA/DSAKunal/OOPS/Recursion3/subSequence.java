package DSAKunal.OOPS.Recursion3;
import java.util.*;

public class subSequence{
    public static void main(String[] args) {
        subseq("", "abc");
        ArrayList<String> result = subseqarr("", "abc");
        System.out.println(result);
    }

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static ArrayList<String> subseqarr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            if(p.isEmpty()){
                return list;
            }
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqarr(p+ch, up.substring(1));
        ArrayList<String> right = subseqarr(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}