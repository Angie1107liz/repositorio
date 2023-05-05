/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

import java.util.Scanner;

public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respuesta;
        int cantidad;
        int precioProducto;
        double subTotal;
        double totalProducto;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("ingresa el valor del producto: ");
            precioProducto = scanner.nextInt();
            System.out.println("ingresa la cantidad del producto: ");
            cantidad = scanner.nextInt();

            subTotal = precioProducto * cantidad;
            System.out.println("El subtotal del articulo es: " + subTotal);
            totalProducto = scanner.nextFloat();
            totalProducto += subTotal;

            System.out.println("El total del articulo es: " + totalProducto);

            System.out.println("Deseas hacer otra compra?");
            System.out.println("1. si");
            System.out.println("2. No ");
            respuesta = scanner.nextInt();
        } while (respuesta == 1);

    }

}
        
    
    

