package LinkedList.Manipulation;

import java.util.*;

class Node {
    int data;
    Node next;
}

public class FindMiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(10);
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);

        System.out.println(ll);

    }
}
