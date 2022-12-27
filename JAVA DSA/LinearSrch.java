public class LinearSrch {
    public static void main(String[] args) {
        int[] nums = {23,456,67,45,8,34,78,98,33};
        int targ = 78;
        int ans = linearSearch2(nums, targ);
        System.out.println(ans);
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
    }

