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

public class Main {
	public static void main(String[] args) {
		double keaktifan;
		double laporan;
		double UTS;
		double UAS;
		double tugas_besar;
		double nilai_akhir;

		//menerima input user

		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai keaktifan (skala 0-100): ");
		keaktifan = input.nextDouble();
		System.out.println("Masukkan nilai laporan (skala 0-100): ");
		laporan = input.nextDouble();
		System.out.println("Masukkan nilai UTS (skala 0-100): ");
		UTS = input.nextDouble();
		System.out.println("Masukkan nilai UAS (skala 0-100): ");
		UAS = input.nextDouble();
		System.out.println("Masukkan nilai Tugas Besar (skala 0-100): ");
		tugas_besar = input.nextDouble();
		

		nilai_akhir = 0.075*keaktifan+0.275*laporan+0.15*UTS+0.15*UAS+0.35*tugas_besar;

		System.out.println("\nNilai akhir mahasiswa tersebut : "+nilai_akhir);
	}
}
