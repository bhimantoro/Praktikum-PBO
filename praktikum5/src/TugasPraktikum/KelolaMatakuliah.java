package TugasPraktikum;
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
        while(ulang) {
            System.out.print("Pilih Menu : ");
            int pil = input.nextInt();
            switch (pil){
                case 1:
                    System.out.println("Kode Makul : "+mk1.cekKodeMakul());
                    break;
                case 2:
                    mk1.ubahKodeMakul("NINF602", "udin8888");
                    System.out.println("Diubah Menjadi : "+mk1.cekKodeMakul());
                    break;
                case 3:
                    System.out.println("JS Makul"+mk1.cekJSMakul());
                    break;
                case 4:
                    mk1.ubahJSMakul(4, "udin8888");
                    System.out.println("Diubah Menjadi "+mk1.cekJSMakul());
                    break;
                case 5:
                    System.out.println("Dosen Makul : "+mk1.cekDosenMakul());
                    break;
                case 6:
                    mk1.ubahDosenMakul("Utomo Pujianto", "udin8888");
                    System.out.println("Diubah Menjadi : "+mk1.cekDosenMakul());
                    break;
                case 7:
                    System.out.println("Angkatan Mhs"+mk1.cekAngkatanMhs());
                    break;
                case 8:
                    mk1.ubahAngkatanMhs(2015, "udin8888");
                    System.out.println("Diubah Menjadi : "+mk1.cekAngkatanMhs());
                    break;
                case 9:
                    System.out.println("Maks Kapasitas : "+mk1.cekMaksKapasitas());
                    break;
                case 10:
                    mk1.ubahMaksKapasitas(15, "udin8888");
                    System.out.println("Diubah Menjadi : "+mk1.cekMaksKapasitas());
                    break;
                case 11:
                    System.out.println("Jumlah Mhs : "+mk1.cekJumlahMhs());
                    break;
                case 12:
                    mk1.tambahMhs("170535629551", "udin8888");
                    break;
                case 13:
                    mk1.cetak();
                    break;
                default:
                    ulang = false;
            }
        }
    }
}
