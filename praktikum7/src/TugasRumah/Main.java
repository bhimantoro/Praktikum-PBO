package TugasRumah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        Jenis x = new Jenis();
        boolean ulang = true;

        System.out.print("Masukkan nama anda ");
        nama = input.next();

        System.out.println("Menu Rental PS\n" +
                "\t1.PS2\n" +
                "\t2.PS3");

        System.out.print("pilih menu : ");
        int menu = input.nextInt();
        System.out.println("yang ngerental " + nama);
        switch (menu) {
            case 1:
                x.ps2();
                break;
            case 2:
                x.ps3();
            default:
                break;
        }
    }
}

