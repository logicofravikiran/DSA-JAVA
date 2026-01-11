package LinkedList;

import java.util.*;

public class Insertion {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(0, 10);
        ll.add(1, 12);
        System.out.println(ll);
        ll.addLast(null);
        ll.addLast(25);
        System.out.println(ll);
        System.out.println("size:- " + ll.size());

        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Data of node at index " + i + ":- " + ll.get(i));
        }

        ll.removeLast();
        System.out.print("Linked List after removing a node:- " + ll);

        System.out.println(ll.element());
        System.out.print("do linkedlist have 111:- ");
        boolean exists = false;
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) == null) {
                continue;
            }
            if (ll.get(i) == 111) {
                // System.out.println("true");

                exists = true;
                break;
            }
        }
        System.out.println(exists);
    }
}
