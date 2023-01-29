package CodingNinja.PriorityQueue;
import java.util.*;

public class PriorityQueueSelf<T> {
    private ArrayList<Element<T>> heap;

    public PriorityQueueSelf(){
        heap = new ArrayList<Element<T>>();
    }

    public void insert(T value, int priority){
        Element<T> e = new Element<>(value, priority);
        heap.add(e);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while(childIndex > 0){
            if(heap.get(childIndex).priority < heap.get(parentIndex).priority){
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = childIndex-1/2;
            }else{
                return;
            }
        }
        
    }

    public T getMin(){
        if(heap.size() == 0){
            System.out.println("Heap is empty");      
        }else{
            return heap.get(0).value;
        }
        return null;
    }

    public T removeMin(){
        Element<T> el = heap.get(0);

        return el.value;

    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.size() == 0;
    }
}
