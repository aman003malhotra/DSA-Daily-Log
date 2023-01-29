package CodingNinja.PriorityQueue;

public class InPlaceHeapSort {
    public static void main(String[] args) {
        int[] arr = {2 ,6 ,8, 5, 4 ,3};
        heapSort(arr);
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void heapSort(int[] arr){
        int n = arr.length;
        for(int i = arr.length/2-1; i >=0; i--){
            downHeapify(arr, i, n);
        }

        for(int i = n-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downHeapify(arr, 0, i);
        }
    }

    public static void downHeapify(int[] arr, int i, int n){
        int parentIndex = i;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        while(leftChildIndex < n){
            int minIndex = parentIndex;
            if(arr[leftChildIndex] < arr[minIndex]){
                minIndex = leftChildIndex;
            }

            if(rightChildIndex < n && arr[rightChildIndex]<arr[minIndex]){
                minIndex = rightChildIndex;
            }

            if(minIndex == parentIndex){
                return;
            }

            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;
            parentIndex = minIndex;
            leftChildIndex = 2* parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
    }
}
