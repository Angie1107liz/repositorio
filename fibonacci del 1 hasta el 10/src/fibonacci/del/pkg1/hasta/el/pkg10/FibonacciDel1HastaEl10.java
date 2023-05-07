/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci.del.pkg1.hasta.el.pkg10;

/**
 *
 * @author Acer
 */
public class FibonacciDel1HastaEl10 {

    
  
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, sum;
        System.out.print(num1 + " " + num2);

        while ((num1 + num2) <= 100) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
    }
}

    
    

