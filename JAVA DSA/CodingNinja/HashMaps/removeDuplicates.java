package CodingNinja.HashMaps;

import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        int [] arr  = {1,3,2,2,3,1,6,2,5};
        System.out.println(removeDuplicate(arr));
    }

    public static ArrayList<Integer> removeDuplicate (int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map  = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i], true);
        }

        return output;
    }

}
