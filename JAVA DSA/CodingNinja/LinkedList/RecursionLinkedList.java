//package CodingNinja.LinkedList;
//
//public class RecursionLinkedList {
//    public static void main(String[] args) {
//
//        printR(head);
//    }
//    public static void printR(Node<Integer> head) {
//        if(head == null){
//            return;
//        }
//        System.out.println(head.data + " ");
//        printR(head.next); // input - 1-> 2-> 3-> 4-> 5-> 6
//        // output 1 2 3 4 5 6
//    }
//
//    public static void printRecursiveReverse(Node<Integer> head) {
//        if(head == null){
//            return;
//        }
//        printR(head.next);
//        System.out.println(head.data + " ");
//         // input - 1-> 2-> 3-> 4-> 5-> 6
//        // output 6 5 4 3 2 1
//    }
//
//
//    public static void insertRecursive(Node<Integer> head, int elem, int pos) {
//
//        if(head == null && pos > 0){
//            return head;
//        }
//        if(pos == 0){
//            Node<Integer> newNode = new Node<>(elem);
//            newNode.next = head;
//            return newNode;
//        }else{
//            head.next = insertRecursive(head.next, elem, pos-1);
//            return head;
//        }
//    }
//}
