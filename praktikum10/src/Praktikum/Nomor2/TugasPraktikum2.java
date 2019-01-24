package Praktikum.Nomor2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TugasPraktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas (lebih dari 1, berupa integer) : "); int n = input.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);
        for (int i=1; i<=n; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        boolean ulang = true;
        while (ulang) {
            System.out.println( "1.\tTampil Data\n" +
                                "2.\tBalik Data\n" +
                                "3.\tAcak Data\n" +
                                "4.\tUrut Data\n" +
                                "Masukkan Pilihan : ");
            int pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Data : "+list);
                    break;
                case 2:
                    Collections.reverse(list);
                    System.out.println("Balik data : "+list);
                    break;
                case 3:
                    Collections.shuffle(list);
                    System.out.println("Acak data : "+list);
                    break;
                case 4:
                    System.out.println("Sebelum diurutkan : "+list);
                    Collections.sort(list);
                    System.out.println("Urutkan data : "+list);
                    break;
                default:
                    ulang = false;
                    break;
            }
        }
    }
}
