package homework4;

import java.util.Collections;
import java.util.LinkedList;

public class homework4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("Original list: ");
        displayList(list);

        LinkedList<Integer> reversedList = reverseList(list);

        System.out.print("Reversed list: ");
        displayList(reversedList);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void displayList(LinkedList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
