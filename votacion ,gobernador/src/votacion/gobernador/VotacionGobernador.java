/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votacion.gobernador;

import java.util.Scanner;

public class VotacionGobernador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int votos = 0;
        int votacion, v1 = 0, v2 = 0, v3 = 0;

        while (votos != 2500000) {
            votos++;

            System.out.println("escoja su candidato");
            System.out.println("1: candidato");
            System.out.println("2: candidato");
            System.out.println("3:  candidato");
            votacion = teclado.nextInt();
            switch (votacion) {
                case 1:
                    v1 = v1 + 1;
                    break;
                case 2:
                    v2 = v2 + 1;
                    break;
                case 3:
                    v2 = v2 + 1;
                    break;
                default:
                    System.out.println("opcion no valida");

            }
            System.out.println("primer candidato " + v1);
            System.out.println("segundo candidato " + v2);
            System.out.println("tercer candidato " + v3);
        }

    }

}

    

