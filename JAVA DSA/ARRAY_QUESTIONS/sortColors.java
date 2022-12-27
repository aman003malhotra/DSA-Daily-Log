// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

package ARRAY_QUESTIONS;

public class sortColors {
    public static void main(String[] args) {
        int[] sArr = {2,0,2,1,1,0};
        sortcolors(sArr); 
        System.out.println(sArr);
    }

    public static void sortcolors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length-1;

        while(m<=h){
            if(nums[m] == 0){
                int temp1 = nums[m];
                nums[m]= nums[l];
                nums[l] = temp1;
                l++;
                m++;
            }else if(nums[m] == 2){
                int temp2 = nums[m];
                nums[m]= nums[h];
                nums[h] = temp2;
                h--;
            }else{
                m++;
            }
        }
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }
}
