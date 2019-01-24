package TugasRumah.MataKuliah;
import java.util.Scanner;

public class KelolaMatakuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matakuliah mk1 = new Matakuliah("NINF601", 2, "Kartika Candra Kirana", 2017);
        mk1.tambahMhs("170535629550", "udin8888");
        System.out.println(
                "=================================\n"+
                        "=\t\t\tMenu Siakad\t\t\t=\n" +
                        "=================================\n"+
                        "\t1. Cek Kode Makul\n" +
                        "\t2. Ubah Kode Makul\n" +
                        "\t3. Cek JS Makul\n" +
                        "\t4. Ubah JS Makul\n" +
                        "\t5. Cek Dosen Makul\n" +
                        "\t6. Ubah Dosen Makul\n" +
                        "\t7. Cek Angkatan Mahasiswa\n" +
                        "\t8. Ubah Angkatan Mahasiswa\n" +
                        "\t9. Cek Maks Kapasitas\n" +
                        "\t10.Ubah Maks Kapasitas\n" +
                        "\t11.Cek Jumlah Mahasiswa\n" +
                        "\t12.Tambah Mahasiswa\n" +
                        "\t13.Cetak\n" +
                        "================================="
        );
        mk1.cetak();
        boolean ulang = true;
        String a = null;
        int b;
        String pw = null;
        while(ulang) {
            System.out.print("\nPilih Menu : ");
            int pil = input.nextInt();
            switch (pil){
                case 1:
                    System.out.println("\n\nKode Makul : "+mk1.cekKodeMakul());
                    break;
                case 2:
                    System.out.print("\n\nMasukkan Kode Makul : ");a = input.next();
                    System.out.print("Masukkan Password   : ");pw = input.next();
                    mk1.ubahKodeMakul(a, pw);
                    System.out.println("Diubah Menjadi : "+mk1.cekKodeMakul());
                    break;
                case 3:
                    System.out.println("\n\nJS Makul : "+mk1.cekJSMakul());
                    break;
                case 4:
                    System.out.print("\n\nMasukkan JS Makul   : ");b = input.nextInt();
                    System.out.print("Masukkan Password   : ");pw = input.next();
                    mk1.ubahJSMakul(b, pw);
                    if (b>5){
                        System.out.print("Gagal Mengubah");
                    }
                    else {
                        System.out.println("Diubah Menjadi " + mk1.cekJSMakul());

                    }
                    break;
                case 5:
                    System.out.println("\n\nDosen Makul : "+mk1.cekDosenMakul());
                    break;
                case 6:
                    System.out.print("\n\nMasukkan Nama Dosen : ");a = input.next();
                    System.out.print("Masukkan Password   : ");pw = input.next();
                    mk1.ubahDosenMakul(a, pw);
                    System.out.println("Diubah Menjadi : "+mk1.cekDosenMakul());
                    break;
                case 7:
                    System.out.println("\n\nAngkatan Mhs"+mk1.cekAngkatanMhs());
                    break;
                case 8:
                    System.out.print("\n\nMasukkan Angkatan   : ");b = input.nextInt();
                    System.out.print("Masukkan Password   : ");pw = input.next();
                    mk1.ubahAngkatanMhs(b, pw);
                    System.out.println("Diubah Menjadi : "+mk1.cekAngkatanMhs());
                    break;
                case 9:
                    System.out.println("\n\nMaks Kapasitas : "+mk1.cekMaksKapasitas());
                    break;
                case 10:
                    System.out.print("\n\nMasukkan Maks Kapasitas : ");b = input.nextInt();
                    System.out.print("Masukkan Password       : ");pw = input.next();
                    mk1.ubahMaksKapasitas(b, pw);
                    if (b>60) {
                        System.out.print("Gagal Mengubah");
                    }
                    else {
                        System.out.println("Diubah Menjadi : " + mk1.cekMaksKapasitas());
                    }
                    break;
                case 11:
                    System.out.println("\n\nJumlah Mhs : "+mk1.cekJumlahMhs());
                    break;
                case 12:
                    System.out.print("\n\nMasukkan Nim      : ");a = input.next();
                    System.out.print("Masukkan Password : ");pw = input.next();
                    mk1.tambahMhs(a, pw);
                    break;
                case 13:
                    mk1.cetak();
                    break;
                default:
                    ulang = false;
                    throw new RuntimeException("Program berhasil dijalankan");
            }
        }
    }
}