package DSAKunal.OOPS.Recursion3;

import java.util.*;

public class IterativeSubsequence {
    public static void main(String[] args) {
        
    }

    // when you find a duplicate element only add it to the newly created subset of previous step

    // because of this point duplicate need to be together
    // sort the array first

    public static ArrayList<ArrayList<Integer>> duplicateSubsequence(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++){
            start = 0;

            int n = outer.size();
            // for(int i = 0; i < n; i++){
            //     ArrayList<Integer> internal = new ArrayList<Integer>(outer.get(i));
            //     internal.add(num);
                // outer.add(internal);
            // }
        }

        return outer;
    }
}
