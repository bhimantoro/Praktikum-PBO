package tugasrumah2;
import java.util.Scanner;
/**
 *
 * @author suryo
 */
public class Main{
	public static void main(String[] args) {
        int saldo = 200000;
        boolean hitung = true;
        Scanner pil = new Scanner(System.in);
        while (hitung) {
            System.out.println("\t\tMenu ATM\n"+
                               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1). Cek Saldo\t\t2). Simpan Uang\n"+
                               "3). Ambil Uang\t\t4). Keluar\n"+
                               "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Pilih Menu : ");
            int menu = pil.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda adalah " + saldo);
                    System.out.println("Apakah anda ingin kembali ke menu ? (1/0)");
                    int a = pil.nextInt();
                    if (a == 1) {
                        hitung = true;
                    } else if (a == 0) {
                        hitung = false;
                    }
                    break;
                case 2:
                    System.out.println("Masukkan jumlah yangg anda simpan =");
                    int b = pil.nextInt();
                    saldo += b;
                    System.out.println("Apakah anda ingin kembali ke menu ? (1/0)");
                    int v = pil.nextInt();
                    if (v == 1) {
                        hitung = true;
                    } else if (v == 0) {
                        hitung = false;
                    }
                    break;
                case 3:
                    System.out.println("Masukkan Jumlah uang yang anda ambil");
                    int n = pil.nextInt();
                    if (n > saldo) {
                        System.out.println("Gagal, Saldo anda kurang");
                    } else {
                        saldo -= n;
                        System.out.println("Saldo Anda Adalah " + saldo);
                    }
                    System.out.println("Apakah anda ingin kembali ke menu ? (1/0)");
                    int d = pil.nextInt();
                    if (d == 1) {
                        hitung = true;
                    } else if (d == 0) {
                        hitung = false;
                    }
                    break;
                case 4:
                    hitung = false;
                	break;
            }
        }
    }
}