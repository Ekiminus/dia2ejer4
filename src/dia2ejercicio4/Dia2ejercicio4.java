//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Raven
 */
public class Dia2ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                double grados, f;
                System.out.println("Ingrese los grados");
                grados = leer.nextDouble();
                f = 32 + (9 * grados / 5);
                System.out.println("Los grados en F son: " + f);
           System.out.println("Los grados en F son; " + (32 + (9 * grados) / 5));
                 
                
                        
    }
    
}
