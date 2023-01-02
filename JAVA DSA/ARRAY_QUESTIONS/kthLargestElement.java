
package ARRAY_QUESTIONS;
import java.util.*;
public class kthLargestElement {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
        }
    }
}
