/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package neumaticos.ejercicio.pkg3.pkg10.pkg4;

import java.util.Scanner;

public class NeumaticosEjercicio3104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        String respuesta;
        double masa = 0;
        int n = 0; // Contador de vehículos

        System.out.println("¿Cuántos vehículos hay en compostura?");
        n = Scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("¿Qué vehículo es? (carro/motocicleta)");
            respuesta = Scanner.next();
            do {
                switch (respuesta) {
                    case "carro" -> {
                        System.out.println("Ingrese la presión:");
                        double presion = Scanner.nextDouble();
                        System.out.println("Ingrese el volumen:");

                        double volumen = Scanner.nextDouble();
                        System.out.println("Ingrese la temperatura:");
                        double temperatura = Scanner.nextDouble();
                        masa += (presion * volumen) / (temperatura + 460);
                    }
                    case "motocicleta" -> {
                        System.out.println("Ingrese la presión:");
                        double presion = Scanner.nextDouble();
                        System.out.println("Ingrese el volumen:");
                        double volumen = Scanner.nextDouble();
                        System.out.println("Ingrese la temperatura:");
                        double temperatura = Scanner.nextDouble();
                        masa += (presion * volumen) / (temperatura + 460);
                    }
                    default -> {
                        System.out.println("Vehículo no válido.");
                        i--; // Restar 1 al contador para no contabilizar el vehículo no válido
                    }
                }
                System.out.println("El promedio de masa de aire de los vehículos es: " + (masa / n));
                Scanner.nextLine();
                System.out.println("¿Desea continuar comprando? (s/n)");
            } while (Scanner.nextLine().equalsIgnoreCase("s"));
        }

        Scanner.close();

    }

}
