package LinkedList.Manipulation;

// import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListManipulation {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        System.out.println(ll);

        // add element to given index
        ll.add(1, 70);
        System.out.println(ll);

        // remove first element
        ll.removeFirst();
        System.out.println(ll);

        // remove last element
        ll.removeLast();
        System.out.println(ll);

        // delete node by value
        ll.removeFirstOccurrence(700);
        System.out.println(ll);

    }
}
