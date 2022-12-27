//package CodingNinja.Stack;
//
//
//import java.util.Collection;
//import java.util.LinkedList;
//
//public class StackImplementation {
//    //Using Array
//    public static class StackUsingArray {
//        private int data[];
//        private int topIndex;
//
//        public StackUsingArray() {
//            this.data = new int[2];
//            this.topIndex = -1;
//        }
//
//        public int size() {
//            return topIndex + 1;
//        }
//
//        public boolean isEmpty() {
//            if (topIndex == -1) {
//                return true;
//            }
//            return false;
//        }
//
//        public void push(int elem) {
//            // If Stack is full;
//            if (topIndex == data.length - 1) {
//                doubleCapacity();
//            }
//            data[topIndex + 1] = elem;
//            topIndex++;
//        }
//
//        private void doubleCapacity() {
//            System.out.println("Double capacity");
//            int temp[] = data;
//            data = new int[2 * temp.length];
//            for (int i = 0; i < temp.length; i++) {
//                data[i] = temp[i];
//            }
//        }
//
//        public int top() {
//            if (topIndex != -1) {
//                return data[topIndex];
//            }
//            return 0;
//        }
//
//        public int pop() {
//            topIndex--;
//            return data[topIndex];
//        }
//    }
//    public class StackUsingLL<T>{
//
//        private LinkedList<T> head;
//        private int size = 0;
//
//        public StackUsingLL(){
//            head = null;
//            size = 0;
//        }
//        public int size(){
//            return size;
//        }
//        public boolean isEmpty(){
//            return size == 0;
//        }
//
//        public void push(T elem){
//            LinkedList<T> node = new LinkedList(elem);
//        }
//
//        public T top(){
//
//        }
//
//        public T pop(){
//
//        }
//    }
//
//
//    public static void main(String[] args) {
//        StackUsingArray stack = new StackUsingArray();
//        stack.push(10);
//        stack.top();
//        stack.pop();
//        stack.size();
//        stack.isEmpty();
//    }
//
//}
