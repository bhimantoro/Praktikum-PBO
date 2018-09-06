/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author suryo
 */
public class Main {
	public static void main(String[] args) {
		int hadir = 80;
		if (hadir<80) {
			System.out.println("Mahasiswa tidak dapat menghadiri ujian. "+ "Kehadiran mahasiswa hanya mencapai "+hadir+" %.");
		}
		else {
			System.out.println("Mahasiswa dapat menghadiri ujian. "+ "Kehadiran mahasiswa sudah mencapai "+hadir+" %.");
		}
	}
}
