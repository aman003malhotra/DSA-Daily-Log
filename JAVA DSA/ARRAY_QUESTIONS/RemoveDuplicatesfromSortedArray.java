package ARRAY_QUESTIONS;

class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
    }
    public static int removeDuplicates(int[] nums) {
        int one = 0;
        int second = 1;
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[i+1]){
                second = i+1;
                nums[one+1] = nums[second];
                one++;
            }
        }
        return answer;
    }
}
