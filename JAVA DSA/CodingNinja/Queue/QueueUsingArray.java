package CodingNinja.Queue;

public class QueueUsingArray {

    private int data[];
    private int front;
    private int rear;

    private int size = 0;

    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int elem){
        if(size == data.length){
            System.out.println("No space");
            return;
        }

        if(front == -1){
            front++;
        }
        rear++;
        //  CIRCULAR QUEUE
        if(rear == data.length){
            rear = 0;
        }
        data[rear] = elem;
        size++;
    }

    public int front(){
        if(size == 0){
            return front;
        }
        return data[front];
    }

    public int dequeue(){
        if(size == 0){
            return -1;
        }
        int temp = front;
        front++;
        if(front == data.length){
            front = 0;
        }
        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return data[temp];
    }

}
