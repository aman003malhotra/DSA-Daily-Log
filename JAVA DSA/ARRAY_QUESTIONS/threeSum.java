package ARRAY_QUESTIONS;
import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        threesum(arr);
    }


    public static ArrayList<ArrayList<Integer>> threesum(int[] nums) {
        ArrayList<ArrayList<Integer>> finalArr = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i<=nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int val1 = nums[i];
            int left = i+1;
            int right = nums.length-1;
            int sumReq = 0-val1;
            while(left < right){
                if(left != 1 && left-1 != i && nums[left] == nums[left-1]){
                    left++;
                    continue;
                }
                if(nums[left] + nums[right] == sumReq){
                    ArrayList<Integer> subfinalArr = new ArrayList<Integer>();
                    subfinalArr.add(val1);
                    subfinalArr.add(nums[left]);
                    subfinalArr.add(nums[right]);
                    finalArr.add(subfinalArr);
                }
                if(nums[left] + nums[right] > sumReq){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return finalArr;
 
     }
}
