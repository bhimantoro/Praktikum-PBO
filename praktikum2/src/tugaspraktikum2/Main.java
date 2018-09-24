/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;
import java.util.Scanner;

/**
 *
 * @author suryo
 */
public class Main {
	public static void main(String[] args) {
		Scanner batas = new Scanner(System.in);

		System.out.print("Masukkan Batas Bawah : ");
		int bawah = batas.nextInt();
		if (bawah<2) {
			System.out.print("Tidak Ada bilangan prima dibawah 2");
		}
		else{
			System.out.print("Masukkan Batas Atas : ");
			int atas = batas.nextInt();

			for (int i = bawah; i <= atas; i++) {
				boolean isPrima = true;

				for (int j = 2; j < i; j++) {
					if (i%j==0) {
						isPrima = false;
						break;
					}
				}

				if (isPrima==true) {
					System.out.print(i+", ");
				}
			}
		}
	}
}
