package ARRAY_QUESTIONS;

public class medianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = nums1.length;
        int median = ((nums1.length + nums2.length)+1)/2;

        while(low <= high){
            int cut1 = (low+high)/2;
            int cut2 = median - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE:nums1[cut1-1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE:nums2[cut2-1];
            int right1 = (cut1 == nums1.length) ? Integer.MAX_VALUE:nums1[cut1];
            int right2 = (cut2 == nums2.length) ? Integer.MAX_VALUE:nums2[cut2];

            if(left1<=right2 && left2<=right1){
                if((nums2.length+nums1.length)%2 != 0){
                    return Math.max(left1, left2);
                }else{
                    return (Math.max(left1, left2) + Math.min(right1,right2))/2.0;
                }


            }else if (left1 > right2){
                high = cut1-1;

            }else{
                low = cut1+1;
            }
        }
       return 0.0;
    }
}


// Approach 1

// Take two pointers, each pointing to each array. Take an array of size (m+n) to store the final sorted array. 
// If the first pointed element is smaller than the second one, store that value in an array and move the first pointer ahead by one.
// Else do the same for the second pointer when the case is vice-versa.
// Then use the formula to get the median position and return the element present at that position.


// Approach 2 Binary Search 
// We will do a binary search in one of the arrays which have a minimum size among the two. 

// Firstly, calculate the median position with (n+1)/2. Point two-pointer, say low and high, equal to 0 and size of the array on which we are applying binary search respectively. Find the partition of the array. Check if the left half has a total number of elements equal to the median position. If not, get the remaining elements from the second array. Now, check if partitioning is valid. This is only when l1<=r2 and l2<=r1. If valid, return max(l1,l2)(when odd number of elements present) else return (max(l1,l2)+min(r1,r2))/2.

// If partitioning is not valid, move ranges. When l1>r2, move left and perform the above operations again. When l2>r2, move right and perform the above operations.