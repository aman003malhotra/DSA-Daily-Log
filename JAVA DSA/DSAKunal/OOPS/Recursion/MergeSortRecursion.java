package DSAKunal.OOPS.Recursion;

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] arr = {8,4,3,12,5,6};
        System.out.println(Arrays.toString(merge(arr)));

    }
    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int m = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, m));
        int[] right = merge(Arrays.copyOfRange(arr, m, arr.length));

        return mergetwo(left, right);
    }
    private static int[] mergetwo(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
               mix[k] = first[i];
               i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // while i is not finished
        // copy the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
