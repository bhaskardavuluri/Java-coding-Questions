package ReverseLinkedList;
//program to reverse an linked list that stores in an iterator i.e descending iterator()...
import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        LinkedList<Integer> l2=new LinkedList<>();
        l1.descendingIterator().forEachRemaining(l2::add);
        System.out.println(l2);
    }
}
