/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.pkg13.pkg4;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Ejercicio3134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner scan=new Scanner(System.in);
  
        int contar; 
      
        
        System.out.println("ingrese el numero hasta donde desea contar");
        contar=scan.nextInt();
        
        int numero[]= new int[contar];
        int impart[]=new int[contar];
          
        for( int i=0; i<contar; i++){
            numero[i]=i;
            impart[i]=i;
             
             if(numero[i] % 2 == 0){
                 System.out.println("los numeros  par son  " +numero[i]);
                 
             }else{
                 if(numero[i] % 2 > 0){
                     System.out.println("los numeros impar son " +impart[i]);
                 }
             } 
                 
         }
         
         
        
        
        
        
     
    }
    
    }
    

