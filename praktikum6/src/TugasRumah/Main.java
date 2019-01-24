package TugasRumah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean menu = true;
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa(
            "170535629519",
            "Bhimantoro Suryo",
            "Admodjo",
            2017,
            "S1 Teknik Informatika",
            "Teknik Elektro",
            "Teknik"
        );

        Staff stf1 = new Staff(
            "14045",
            "Pipit",
            "Suripit",
            "Teknik Mesin",
            "Teknik",
            "Wakil Dekan VII",
            "PNS",
            "XII/A"
        );

        Universitas stf2 = new Universitas(
            "14022",
            "Didi",
            "Suparlan",
            "LP7",
            "Gudang"
        );

        while (menu){
            System.out.println("Inheritance dan Overriding");
            System.out.println("============================");
            System.out.println("=            Menu          =");
            System.out.println("============================\n");
            System.out.println("\t1. Mahasiswa\n" +
                               "\t2. Staff Fakultas\n" +
                               "\t3. Staff Universitas"
            );
            System.out.print("Masukkan Menu : ");
            int pil = input.nextInt();
            switch (pil){
                case 1:
                    mhs1.info();
                    break;
                case 2:
                    stf1.info();
                    break;
                case 3:
                    stf2.info();
                    break;
                default:
                    System.out.println("\nTidak ada dimenu");
                    menu = false;
                    break;
            }
        }
    }
}
