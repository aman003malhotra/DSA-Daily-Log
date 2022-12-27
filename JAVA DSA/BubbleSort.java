import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arrToSort = {1,2,3,4,5};
        bubbleSort(arrToSort);
    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
