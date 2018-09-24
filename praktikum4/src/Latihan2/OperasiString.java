package Latihan2;
import java.io.*;
public class OperasiString {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String nama_depan;
        String nama_belakang;

        System.out.print("Nama Depan Anda : ");
        nama_depan = input.readLine();

        System.out.print("Nama Belakang : ");
        nama_belakang = input.readLine();

        System.out.println("Nama Depan : "+nama_depan);
        System.out.println("Nama Belakang : "+nama_belakang);
        System.out.println("Huruf Kapital : "+nama_depan.toUpperCase());
        System.out.println("Huruf Kecil : "+nama_depan.toLowerCase());
        System.out.println("Total Karakter : "+nama_depan.length());
        System.out.println("Hai ".concat(nama_depan)+" ".concat(nama_belakang)+"!");
        System.out.println("Total karakter setelah digabung : "+"Hai ".concat(nama_depan).concat(" ").concat(nama_belakang).concat("!").length());
    }
}
