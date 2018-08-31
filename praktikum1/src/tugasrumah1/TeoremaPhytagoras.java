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
public class TeoremaPhytagoras {
    static double pitagoras(double a, double b){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
        
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Teorema Phytagoras");
        System.out.println("===========================");
        System.out.print("Alas Segitiga : "); 
            double a = keyboard.nextDouble();
        System.out.print("Tinggi Segitiga : "); 
            double b = keyboard.nextDouble();

        double c = pitagoras(a, b);
        
        System.out.println("sisi miring = " + c);
    }
}
