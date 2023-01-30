package DSAKunal.OOPS.Recursion3;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutationarr("", "abc"));
        System.out.println(permutationCount("", "abc"));

    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutationarr(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<String>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationarr(f + ch + s, up.substring(1)));
        }

        return ans;
    }

    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count += permutationCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}
