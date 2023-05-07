/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimo.comun.multiplo;

import java.util.Scanner;
public class MinimoComunMultiplo {

    
    
    public static int calcularMcm(int a, int b) {
        int mcd = calcularMcd(a, b);
        return (a * b) / mcd;
    }
    
    public static int calcularMcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        
        if (num2 % 2 != 0) {
            int mcm = calcularMcm(num1, num2);
            System.out.println("El MCM de " + num1 + " y " + num2 + " es " + mcm);
        }
    }
}
   
    

