import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // you cannot use primitives, you have to add wrappers.
        list.add(67);
        list.add(66);
        list.add(65);
        list.add(64);
        list.add(63);
        list.add(62);

        System.out.println(list);

        // gives true or false
        System.out.println(list.contains(67));
        list.set(0, 45);

        System.out.println(list);

        list.remove(2);

        System.out.println(list.size());

        System.out.println(list.get(4));

        // size is fixed internally
        // lets say the arraylist is filled to some amount, now another list is created of double the size
        // old elements are copied to the new one
        //

    }
}
