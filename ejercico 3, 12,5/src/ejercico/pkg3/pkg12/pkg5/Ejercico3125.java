/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico.pkg3.pkg12.pkg5;

import java.util.Scanner;
public class Ejercico3125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
}
}
    
    

