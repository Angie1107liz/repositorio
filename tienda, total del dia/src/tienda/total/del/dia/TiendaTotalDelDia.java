/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda.total.del.dia;

import java.util.Scanner;

public class TiendaTotalDelDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalVentas = 0;
        int numClientes = 0;
        int compra;
        while (numClientes < 200) {
            numClientes++;
            System.out.println("Ingrese el monto total de la compra del cliente " + numClientes + ":");
            compra = teclado.nextInt();
            totalVentas += compra;
        }
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Número de clientes atendidos: " + numClientes);
    }

}
