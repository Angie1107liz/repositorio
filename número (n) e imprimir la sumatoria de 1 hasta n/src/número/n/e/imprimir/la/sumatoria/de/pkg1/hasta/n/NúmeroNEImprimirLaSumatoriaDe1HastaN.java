/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package número.n.e.imprimir.la.sumatoria.de.pkg1.hasta.n;

import java.util.Scanner;

public class NúmeroNEImprimirLaSumatoriaDe1HastaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int resultado = 0;
        int contador = 0;

        System.out.println("ingrese un numer");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {

            resultado += i;

            System.out.println("respuesta" + resultado);

        }
    }

}
    

