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

public class Main_c {
    public static void main(String[] args) {
        double keaktifan,
                laporan,
                UTS = 0,
                UAS = 0,
                tugas_besar,
                nilai_akhir,
                kehadiran;
        
        Scanner input=new Scanner(System.in);
            System.out.println("Masukkan nilai keaktifan (Skala 0-100): ");
            keaktifan = input.nextDouble();
            if (keaktifan<=100){
                System.out.println("Masukkan nilai laporan (Skala 0-100): ");
                laporan = input.nextDouble();
                if (laporan<=100){
                    System.out.println("Masukkan nilai UTS (Skala 0-100): ");
                    UTS = input.nextDouble();  
                    if(UTS<=100){
                        System.out.println("Masukkan nilai UAS (Skala 0-100): ");
                        UAS = input.nextDouble();
                        if(UAS<=100){
                            System.out.println("Masuukan nilai tugas besar (Skala 0-100): ");
                            tugas_besar = input.nextDouble();
                            if(tugas_besar<=100){
                                nilai_akhir = 0.075*keaktifan+0.275*laporan+0.15*UTS+0.15*UAS+0.35*tugas_besar;
                                System.out.println("\nNilai akhir mahasiswa adalah : "+nilai_akhir);
                            }
                            else{
                                System.out.println("Error");
                            }
                        }
                        else{
                            System.out.println("Error");
                        }
                    }
                    else{
                        System.out.println("Error");
                    }
                }
                else{
                    System.out.println("Error");
                }
            }
            else{
                System.out.println("Error");}
    }
}