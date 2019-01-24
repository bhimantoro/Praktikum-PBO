package Praktikum.Nomor1;

import java.util.*;

public class TugasPraktikum1 {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<Integer>();
        A.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));

        Set<Integer> B = new HashSet<Integer>();
        B.addAll(Arrays.asList(new Integer[]{5,6,7,8,9,10}));


        boolean ulang = true;
        while (ulang) {
            System.out.println("==============================");
            System.out.println("=            Menu            =");
            System.out.println("==============================");
            System.out.println("=          1. A - B          =");
            System.out.println("=          2. A U B          =");
            System.out.println("=          3. A n B          =");
            System.out.println("==============================");
            System.out.println("  A = "+A);
            System.out.println("  B = "+B);
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih Menu : ");
            int pil = input.nextInt();
            switch(pil) {
                case 1:
                    Set<Integer> difference = new HashSet<Integer>(A);
                    difference.removeAll(B);
                    print("Difference", difference);
                    break;
                case 2:
                    Set<Integer> union = new HashSet<Integer>(A);
                    union.addAll(B);
                    print("Union", union);
                    break;
                case 3:
                    Set<Integer> intersect = new HashSet<Integer>(A);
                    intersect.retainAll(B);
                    print("Intersect", intersect);
                    break;
                default:
                    ulang = false;
                    break;
            }
        }
    }

    private static void print(String label, Collection c) {
        System.out.println(label);
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
