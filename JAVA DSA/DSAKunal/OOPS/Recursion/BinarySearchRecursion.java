package DSAKunal.OOPS.Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }
    static int binarySearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
            e = m-1;
            return binarySearch(arr, target, s, e);
        }
        s = m + 1;
        return binarySearch(arr, target, s, e);

    }
}
