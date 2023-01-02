package ARRAY_QUESTIONS;
import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        twoSum(arr, 6);
    }
    public static int[] twoSum(int[] nums, int target) {
        int intArray[] = new int[2];
        int count = 0;
        int left = 0;
        int right = nums.length-1;
        int[][] newTwoDim = new int[nums.length][2];
        for(int i = 0 ; i<nums.length; i++){
            newTwoDim[i][0] = nums[i];
            newTwoDim[i][1] = i;
        }
        Arrays.sort(newTwoDim, Comparator.comparingDouble(o -> o[0]));
        while(left < right){
            if(newTwoDim[left][0] + newTwoDim[right][0] == target){
                intArray[count] = left;
                count++;
                intArray[count] = right;
                break;
            }else if(newTwoDim[left][0] + newTwoDim[right][0] > target){
                right--;
            }else{
                left++;
            }
        }
        // intArray = finalList.toArray(intArray);
        return intArray;
    }
}
