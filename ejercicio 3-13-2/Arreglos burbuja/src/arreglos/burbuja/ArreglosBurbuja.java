/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos.burbuja;

import java.util.Scanner;

public class ArreglosBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. paso entender el ejercicio
        //2.entradas del programas
        //      10 números desorganizados
        //3. proceso: organizar los números
        //4. los 10 números organizados de menor a mayor

        //para la entrada
       Scanner scan = new Scanner(System.in);
        System.out.println("ingresa la cantidad de numeros que vas a ingresar");
        int cantidad = scan.nextInt();

        int numeros[] = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingresa el numero" + (i + 1));
            numeros[i] = scan.nextInt();

        
          
  
         
        }
    
    
        System.out.println("que numero deseas buscar");
        int buscar=scan.nextInt();
        int posicion=-1;
        for (int i=0;i<buscar;i++){
            if (numeros[i]==buscar){
                posicion=i;
                break;
            }
      
        
        }
      
        if (posicion != -1) {
            System.out.println("El número " + buscar + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número " + buscar + " no se encuentra en la lista.");
        }  
        
}
}