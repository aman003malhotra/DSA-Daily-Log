package DSAKunal.OOPS.Recursion;

import java.util.ArrayList;

public class ArrayWithoutTheArgument {
    public static void main(String[] args) {
        int[] arr = {3,5,7,6,8,3};
        System.out.println(findIndex(arr, 3, 0));
    }
    static ArrayList findIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow= findIndex(arr, target, index+1);
        list.addAll(ansFromBelow);
        return list;
    }
}
