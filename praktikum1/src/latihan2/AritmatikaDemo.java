/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author suryo
 */
public class AritmatikaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        
        System.out.println("Variable Values...");
        System.out.println("  i = "+i);
        System.out.println("  j = "+j);
        System.out.println("  x = "+x);
        System.out.println("  y = "+y);
        
        System.out.println("Adding");
        System.out.println("i+j = "+(i+j));
        System.out.println("x+y = "+(x+y));
        
        System.out.println("Substracting");
        System.out.println("i-j = "+(i-j));
        System.out.println("x-y = "+(x-y));
        
        System.out.println("Multiplying");
        System.out.println("i*j = "+(i*j));
        System.out.println("x*y = "+(x*y));
        
        System.out.println("Deviding");
        System.out.println("i/j = "+(i/j));
        System.out.println("x/y = "+(x/y));
        
        System.out.println("Mixing Types");
        System.out.println("j+y = "+(j+y));
        System.out.println("i*x = "+(i*x));
        
        System.out.println("Modulus Operation");
        System.out.println("i modulus 4 = "+(i%4));
        System.out.println("j modulus 4 = "+(j%4));
        System.out.println("x modulus 4 = "+(x%4));
        System.out.println("y modulus 4 = "+(y%4));
    }
    
}
