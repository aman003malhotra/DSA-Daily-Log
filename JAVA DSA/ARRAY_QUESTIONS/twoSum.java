package ARRAY_QUESTIONS;
import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        twosum(arr, 6);
    }
    public static int[] twosum(int[] nums, int target) {
        int intArray[] = new int[2];
        int count = 0;
        int left = 0;
        int right = nums.length-1;
        int[][] newTwoDim = new int[nums.length][2];
        for(int i = 0 ; i<nums.length; i++){
            newTwoDim[i][0] = i;
            newTwoDim[i][1] = nums[i];
        }
        Arrays.sort(newTwoDim, Comparator.comparingDouble(o -> o[1]));
        while(left < right){
            if(newTwoDim[left][1] + newTwoDim[right][1] == target){
                intArray[0] = newTwoDim[left][0];
                intArray[1] = newTwoDim[right][0];
                break;
            }else if(newTwoDim[left][1] + newTwoDim[right][1] > target){
                right--;
            }else{
                left++;
            }
        }
        return intArray;
    }
}
