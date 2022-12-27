import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrToSort = {6,7,8,9,0,3,4,2};
        insertionSort(arrToSort);
        System.out.println(Arrays.toString(arrToSort));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
                int k = i+1;
                while(k > 0){
                    if (arr[k] < arr[k - 1]) {
                        int temp = arr[k];
                        arr[k] = arr[k - 1];
                        arr[k - 1] = temp;
                    }else{
                        break;
                    }
                    k--;
                }
            System.out.println(Arrays.toString(arr));
         }
        }
    }
