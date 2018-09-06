/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author suryo
 */

import java.util.Scanner;

public class Main_b {
    public static void main(String[] args) {
        double keaktifan,
                laporan,
                UTS = 0,
                UAS = 0,
                tugas_besar,
                nilai_akhir,
                kehadiran;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah Kehadiran (0-16) min kehadiran 13x ");
        kehadiran= input.nextDouble();
  
        if(kehadiran >= 13 ){
            System.out.print("Masukkan nilai keaktifan (skala0-100) ");
            keaktifan = input.nextDouble();
            System.out.print("Masukkan nilai laporan (skala0-100) ");
            laporan = input.nextDouble();
            System.out.print("Masukkan nilai UTS (skala0-100) ");
            UTS = input.nextDouble();
            System.out.print("Masukkan nilai UAS (skala0-100) ");
            UAS = input.nextDouble();
            System.out.print("Masukkan nilai Tugas Besar (skala0-100) ");
            tugas_besar = input.nextDouble();
            nilai_akhir = 0.075*keaktifan+0.275*laporan+0.15*UTS+0.15*UAS+0.35*tugas_besar;
        
            System.out.println("\nNilai akhir masahasiswa :"  + nilai_akhir);
              
        }else{
            System.out.println("Nilai akhir anda = E");
        }
    }   
}
