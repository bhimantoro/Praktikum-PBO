package TugasRumah;
import java.util.Scanner;

public class TokoBangunan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String menu[] = {"Nama Material", "Merk"};

        String material[][] = {
                {"Semen","Conch"},
                {"Tandon","Penguin"},
                {"Semen","Tonasa"},
                {"Tandon","GRAND"},
                {"Cat","DanaPaint"},
                {"Cat","Avian"},
                {"Seng", "Soka"},
                {"Seng", "Sakura"}
        };

        String cabang[] = {"Pasar Besar", "Karangploso", "Tlogomas", "Dieng"};

        System.out.println("Toko Bangunan Online Terlengkap Se-Malang Raya");

        System.out.println("Daftar Material : \nNama\t\tMerk\n=================");
        for (int i=0; i<material.length; i++){
            System.out.println((i+1)+". "+material[i][0]+"\t"+material[i][1]);
        }
        System.out.println("\nDaftar Cabang : ");
        for (int i=0; i<cabang.length; i++){
            System.out.println((i+1)+". "+cabang[i]);
        }

        System.out.print("\nMasukkan Nomor Barang = ");
        int choose = input.nextInt();

        System.out.print("\nIngin Membeli pada Cabang ? ");
        int pilih = input.nextInt();

        System.out.println("\nData Pembelian".toUpperCase());

        for (int i=0; i<material[choose-1].length; i++){
            System.out.println(menu[i]+" : "+material[choose-1][i]);
        }
        System.out.println("Cabang : "+cabang[pilih-1]);
        System.out.print("\nLanjut Checkout? ".concat("(y/t)").replace('u','U'));
        String pil = input.next();
        if ("y".equals(pil)){
            System.out.println("Checkout Success");
        }
        else if ("t".equals(pil)){
            System.out.println("Checkout Gagal");
        }
        else {
            System.exit(0);
        }
    }
}
