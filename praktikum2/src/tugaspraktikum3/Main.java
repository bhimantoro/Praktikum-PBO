/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum3;
import java.util.Scanner;

/**
 *
 * @author suryo
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Menu Konversi suhu : \n"+
			"\t1. Celcius ke Reamur\n"+
			"\t2. Celcius ke Kelvin\n"+
			"\t3. Celcius ke Fahrenheit\n"+
			"Pilih Menu : ");
		int menu = input.nextInt();

        switch (menu) {
            case 1:
                {
                    System.out.print("Masukkan suhu : ");
                    double suhu = input.nextDouble();
                    System.out.print("Nilai Reamur : "+(0.8*suhu)+" R");
                    break;
                }
            case 2:
                {
                    System.out.print("Masukkan suhu : ");
                    double suhu = input.nextDouble();
                    System.out.print("Nilai Kelvin : "+(273.15+suhu)+" K");
                    break;
                }
            case 3:
                {
                    System.out.print("Masukkan suhu : ");
                    double suhu = input.nextDouble();
                    System.out.print("Nilai Fahrenheit : "+((1.8*suhu)+32)+" F");
                    break;
                }
            default:
                break;
        }
	}
}