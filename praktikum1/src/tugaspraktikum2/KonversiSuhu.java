/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;

/**
 *
 * @author suryo
 */
public class KonversiSuhu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 25;
        
        System.out.println("Nili Celcius = "+c+" C");
        System.out.println("Reamur : "+(0.8*c)+" R");
        System.out.println("Kelvin : "+(c+273.15)+" K");
        System.out.println("Fahrenheit : "+((1.8*c)+32)+" F");
    }
}
