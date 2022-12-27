package DSAKunal.OOPS.Recursion;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {8,4,3,12,5,6};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quick(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while (s<= e){
            // also a reason why if it is already sorted, it won't swap
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quick(nums, low, e);
        quick(nums, s, high);
    }
}
