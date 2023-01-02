package ARRAY_QUESTIONS;

public class containerWithMostWater {
    public int maxArea(int[] height) {
        int maxAr = Integer.MIN_VALUE;
        int width = height.length - 1;
        int minHeight;

        int left = 0;
        int right = height.length-1;

        while(left < right){
           int arr = Math.min(height[left], height[right]) * width;
           if(height[left] >= height[right]){
               right --;
           width--;

           }else if(height[left] < height[right]){
               left++;
           width--;

           }
           if(arr > maxAr){
               maxAr = arr;
           }
        }
        return maxAr;
    }
}
