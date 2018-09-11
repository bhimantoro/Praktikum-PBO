/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrumah1;
import java.util.Scanner;

/**
 *
 * @author suryo
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Tinggi Segitiga : ");
		int tinggi = input.nextInt();

		for (int w = 1; w <= tinggi; w++) {
			for (int x = tinggi-1; x >= w; x--) {
				System.out.print(" ");
			}
			for (int y = 1; y <= w; y++) {
				System.out.print("*");	
			}
			for (int z = 1; z <= w-1; z++) {
				System.out.print("*");		
			}
			System.out.println();	
		}
	}
}
