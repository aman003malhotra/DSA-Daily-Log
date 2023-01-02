package ARRAY_QUESTIONS;

public class maximumProductSubarray {
    public int maxProduct(int[] nums) {
        int mProduct = Integer.MIN_VALUE;
        int pro = 1;
        for(int i = 0; i<nums.length;i++){
            pro *= nums[i];
            mProduct = Math.max(pro, mProduct);
            if(pro == 0){
                pro = 1;   
            } 
        }
        pro = 1;
        for(int i = nums.length-1; i>=0 ;i--){
            pro *= nums[i];
            mProduct = Math.max(pro, mProduct);
            if(pro == 0){
                pro = 1;   
            } 
        }
        return mProduct;
    }
}
