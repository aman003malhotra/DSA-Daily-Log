import java.util.Arrays;

public class SelectionSort {
        public static void main(String[] args) {
            int[] arrToSort = {6,7,8,9,0,3,4,3,2};
            selectionSort(arrToSort);
//        System.out.println(Arrays.toString(arrToSort));
        }
        static void selectionSort(int[] arr){
            for (int i = 0; i < arr.length-1; i++) {
                int max = arr[0];
                int maxIndex = 0;
                for (int j = 0; j <=arr.length-i-1 ; j++) {
                    if(arr[j] > max){
                        max = arr[j];
                        maxIndex = j;
                    }
                }
                int temp = arr[arr.length-i-1];
                arr[arr.length-i-1] = arr[maxIndex];
                arr[maxIndex] = temp;

                System.out.println(Arrays.toString(arr));
            }
        }
    }
