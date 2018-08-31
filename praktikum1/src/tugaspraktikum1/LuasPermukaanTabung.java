/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum1;

/**
 *
 * @author suryo
 */
public class LuasPermukaanTabung {
    public static void main(String[] args){
        int r = 7;
        int t = 10;
        double phi = 3.142857142857143;

        System.out.println("Nilai Variabel");
        System.out.println("r = "+r);
        System.out.println("t = "+t);
        System.out.println("LP = "+(2*phi*r*(r+t)));
    }
}
