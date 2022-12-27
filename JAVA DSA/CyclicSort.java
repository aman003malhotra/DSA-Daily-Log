import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arrToSort = {4,3,2,7,8,3,2,1};
        cyclicsort(arrToSort);
    }

    static void cyclicsort(int arr[]){
        for (int i = 0; i < arr.length;) {
            if(arr[i] <= arr.length && arr[i] != i+1 ){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
            }else{
                i++;
            }
//            System.out.println(Arrays.toString((arr)));
        }
    }
}
