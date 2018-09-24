package TugasPraktikum2;
/**
 *
 * @author suryo
 */
import java.util.Scanner;
class Truk {
    private double muatan;
    private double muatanmaks;
    public Truk(double beratmaks){
        this.muatanmaks = beratmaks;
    }
    public double getMuatan(){
        return muatan;
    }
    public double getMuatanMaks(){
        return muatanmaks;
    }
    public boolean tambahMuatan(double berat) {
        if ((muatan+berat) > muatanmaks) {
            return false;
        }
        else{
            muatan += berat;
            return true;
        }
    }
}

public class Main {
    public static void main(String[] args){
        boolean hitung = true;
        Truk muat = new Truk(1000);
        String pil;
        boolean status;
        System.out.println("Muatan Maksimal = "+muat.getMuatanMaks());
        System.out.println("Muatan saat ini = "+muat.getMuatan());
        Scanner input = new Scanner(System.in);
        while(hitung){
            System.out.print("Apakah user ingin menambahkan muatan? ");
            pil = input.next();
            if("y".equals(pil)){
                System.out.print("\nTambahan muatan = ");
                status = muat.tambahMuatan(input.nextDouble());
                if(status){
                    System.out.println("Muatan Berhasil Ditambahkan");
                }
                else{
                    System.out.println("Tambahan muatan melebihi kapasitas maksimal.Muatan tidak berhasil ditambahkan.");
                }
                System.out.println("Muatan saat ini "+muat.getMuatan());
            }
            else {
                hitung = false;
            }
        }
    }
}