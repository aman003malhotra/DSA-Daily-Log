package ARRAY_QUESTIONS;

public class findMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] NArr = {2,1};
        System.out.println(findMin(NArr));
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        if(nums.length == 1){
            return nums[0];
        }

        if(nums[start] < nums[end]){
            return nums[start];
        }
        while (start <= end ){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }else if(nums[mid] < nums[mid-1]){
                return nums[mid];
            }else if(nums[start] < nums[mid]){
                start = mid + 1;
            }else if(nums[mid] <= nums[end]){
                end = mid-1;
            }
        }
        return -1;
    }  
}
