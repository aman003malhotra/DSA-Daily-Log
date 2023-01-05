package ARRAY_QUESTIONS;

public class searchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        searchInsert(arr, 2);
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MIN_VALUE;
        if(target < nums[0]){
            return 0;
        }else if(target > nums[nums.length-1]){
            return nums.length - 1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid] < target){
                start = mid + 1;

            }else{
                end = mid - 1;

            }
        }
        if(ans != Integer.MIN_VALUE){
            return ans;
        }else{
            return start;
        }
    }

}
