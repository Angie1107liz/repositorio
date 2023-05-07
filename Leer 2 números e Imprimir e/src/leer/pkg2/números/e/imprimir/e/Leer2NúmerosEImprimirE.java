/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leer.pkg2.números.e.imprimir.e;

import java.util.Scanner;

public class Leer2NúmerosEImprimirE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;

        do {

            System.out.print("singres el primer numero");
            num1 = teclado.nextInt();
            System.out.print("singres el segundo numero");
            num2 = teclado.nextInt();

            resultado = num1 + num2;

            System.out.println("el  producto del primer nuymero " + num1 + " es " + resultado);

            System.out.println("Presione 's' para continuar comprando o cualquier otra tecla para salir");

            teclado.nextLine(); // limpiar el buffer del teclado antes de leer la siguiente entrada

        } while (teclado.nextLine().equalsIgnoreCase("s"));

        teclado.close();
    }
}
