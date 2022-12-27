package DSAKunal.OOPS.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL newLL = new LL();
        newLL.insertFirst(3);
        newLL.insertFirst(2);
        newLL.insertFirst(8);
        newLL.insertFirst(27);
        newLL.insertLast(45);
        newLL.insert(34, 3);
        newLL.display();

        DoublyLL newDLL = new DoublyLL();
        newDLL.insertFirst(3);
        newDLL.insertFirst(2);
        newDLL.insertFirst(8);
        newDLL.insertFirst(27);
        newDLL.display();


        CircularLL newCll = new CircularLL();
    }
}
