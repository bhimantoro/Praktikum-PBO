package Latihan;
import java.util.*;

public class Latihan6 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("C");al.add("A");
        al.add("E");al.add("B");
        al.add("D");al.add("F");
        System.out.println("Original contents of al: ");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();
        ListIterator litr = al.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println("\nModified list backwards: ");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
