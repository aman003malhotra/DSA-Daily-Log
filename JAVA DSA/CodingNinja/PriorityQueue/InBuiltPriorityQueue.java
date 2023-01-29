package CodingNinja.PriorityQueue;
import java.util.PriorityQueue;


public class InBuiltPriorityQueue {

    public static void main(String[] args) {
        int[] arr = {4,3,7,6,9,10,1,2};
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for(int i = 0; i <arr.length; i++){
            pQueue.add(arr[i]);
        }

    }      
    
}
