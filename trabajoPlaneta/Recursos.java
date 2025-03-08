import java.util.ArrayList;
import java.lang.System;
import java.util.Scanner;


public class Recursos {

    public static void main(String[] args) {

         //CREAR LISTA
        ArrayList<String>Lista = new ArrayList<>();
        
        Lista.add("Jupiter");
        Lista.add("Mercurio");
        Lista.add("Urano");
        Lista.add("Neptuno");
        Lista.add("Marte");
        Lista.add("Venus");
        Lista.add("Pluton");
        Lista.add("Saturno");

        //Desplegar planetas opcionados

        System.out.println("A continuacion se presenta los planetas disponibles");
        for (int i = 0; i < Lista.size(); i++) {
            System.out.println((i + 1) + ". " + Lista.get(i));
        }

        // Cantidad de recursos necesarios para cada planeta

        int[] combustibleNecesario = {50, 60, 34, 60, 53, 14, 42, 200}; // Ejemplo: en litros de combustible
        int[] oxigenoNecesario = {89, 23, 32, 78, 90, 85, 75,43}; // Ejemplo: en litros de oxígeno


        

        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que elija un número correspondiente a un planeta
        System.out.print("Ingresa el número del planeta: ");
        int opcion = scanner.nextInt();

        // Verificar que la opción sea válida
        if (opcion >= 1 && opcion <= Lista.size()) {
            // Mostrar el planeta elegido
            String planetaElegido = Lista.get(opcion - 1);
            System.out.println("Has elegido: " + planetaElegido);

            // Mostrar los recursos necesarios para el planeta elegido
            int combustibleRequerido = combustibleNecesario[opcion - 1];
            int oxigenoRequerido = oxigenoNecesario[opcion - 1];


            System.out.println("Recursos necesarios para el viaje:");
            System.out.println("Combustible: " + combustibleRequerido + " litros");
            System.out.println("Oxígeno: " + oxigenoRequerido + " % de oxígeno");

            // Pedir al usuario que ingrese la cantidad de recursos disponibles
            System.out.print("Ingresa la cantidad de combustible disponible (en litros): ");
            int combustibleDisponible = scanner.nextInt();

            System.out.print("Ingresa la cantidad de oxígeno disponible (en %): ");
            int oxigenoDisponible = scanner.nextInt();

            // Verificar si los recursos son suficientes para el viaje
            if (combustibleDisponible >= combustibleRequerido && oxigenoDisponible >= oxigenoRequerido) {
                System.out.println("¡Tienes suficiente combustible y oxígeno para el viaje!");
            } else {
                if (combustibleDisponible < combustibleRequerido) {
                    System.out.println("No tienes suficiente combustible. Necesitas " + (combustibleRequerido - combustibleDisponible) + " litros más.");
                }
                if (oxigenoDisponible < oxigenoRequerido) {
                    System.out.println("No tienes suficiente oxígeno. Necesitas " + (oxigenoRequerido - oxigenoDisponible) + " litros más.");
                }
            }

        } else {
            // Si la opción no es válida
            System.out.println("Opción inválida. Por favor elige un número entre 1 y 8 de la lista de planetas." + Lista.size());
        }

        // Cerrar el scanner
        scanner.close();
    }

    }
    

