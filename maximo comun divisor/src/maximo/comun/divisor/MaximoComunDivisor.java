/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximo.comun.divisor;


import java.util.Scanner;
public class MaximoComunDivisor {

    


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

        if (num1 % 2 == 0) {
            int mcd = calcularMcd(num1, num2);
            System.out.println("El MCD de " + num1 + " y " + num2 + " es " + mcd);
        }
    }
}
    
    

