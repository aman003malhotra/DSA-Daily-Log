package ARRAY_QUESTIONS;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arrf = {-1,1,0,-3,3};
        System.out.println(productExceptSelf(arrf));
    }
    public static int[] productExceptSelf(int[] nums) {
        int leftProduct = 1;
        int[] rightProduct = new int[nums.length]; 
        int[] finalArr = new int[nums.length];
 
        int prod = 1;
         for(int i = nums.length-1; i>= 0; i--){
            prod *= nums[i]; 
            rightProduct[i] = prod;
         }
 
         for(int i = 0; i<nums.length; i++){
             if(i == nums.length-1){
                 finalArr[i] = leftProduct;
                 continue;
             }
             finalArr[i] = leftProduct * rightProduct[i+1];
             leftProduct *= nums[i]; 
 
         }
         return finalArr;
         
     }
}
