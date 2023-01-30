package DSAKunal.OOPS.Recursion3;
import java.util.*;

public class test {
    static ArrayList<ArrayList<Integer>> sol = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
		// Write your code here
        int[] input = {15, 20, 12};
        ArrayList<Integer> fin = new ArrayList<Integer>();

        subseq(fin, input, 0);
        System.out.println(sol);
    }

    public static void subseq(ArrayList<Integer> temp, int[] nums, int i){
        if(i == nums.length){
            System.out.println(temp);
           	sol.add(temp);
            return;
        }
		// ArrayList<Integer> rem = new ArrayList<Integer>();
        // int ch = input[start];
  		subseq(temp, nums, i + 1);
		temp.add(nums[i]);
        subseq(temp, nums, i+1);
		// left.addAll(right);

		// return left;
    } 
}
