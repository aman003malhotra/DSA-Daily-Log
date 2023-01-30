package DSAKunal.OOPS.Recursion3;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        diceProblem("", 4);
        System.out.println(diceProblemarr("", 4));

    }

    public static void diceProblem(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= target; i++){
            diceProblem(p + i, target-i);
        }
    }

    public static ArrayList<String> diceProblemarr(String p, int target){
        if(target == 0){
            ArrayList<String> arr = new ArrayList<String>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 1; i <= target; i++){
            list.addAll(diceProblemarr(p + i, target-i));
        }

        return list;
    }
}
