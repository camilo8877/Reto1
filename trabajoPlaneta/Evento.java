import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Evento {

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



         // ENTRADA DEL USUARIO 
         Scanner scanner = new Scanner(System.in);
         Random rand = new Random();
        
        // Pedir al usuario que elija un número correspondiente a un planeta
        System.out.print("Ingresa el número del planeta: ");
        int opcion = scanner.nextInt();


         // Verificar que la opción sea válida
         if (opcion >= 1 && opcion <= Lista.size()) {
            // Mostrar el planeta elegido
            String planetaElegido = Lista.get(opcion - 1);
            System.out.println("Has elegido: " + planetaElegido);
            // Generar un evento aleatorio que pueda afectar el viaje
            generarEvento(rand, scanner);
        }

     else {
        // Mostrar mensaje si la opción es inválida
        System.out.println("Opción no válida. Por favor, elige un número entre 1 y " + Lista.size() + ".");
    
    
    }

    // Cerrar el scanner
    scanner.close();

}



//Método para generar eventos aleatorios
 public static void generarEvento(Random rand, Scanner scanner) {
    // Generar un número aleatorio entre 0 y 1 para determinar el tipo de evento
    int evento = rand.nextInt(1); 


    switch (evento) {

        case 0:
        // Lluvia de asteroides
        System.out.println("\n¡Cuidado! Un campo de asteroides está frente a ti.");
        System.out.print("¿Quieres intentar esquivarlos? (S/N): ");
        char respuestaAsteroides = scanner.next().charAt(0);
        if (respuestaAsteroides == 'S' || respuestaAsteroides == 's') {
            if (rand.nextBoolean()) {
                System.out.println("¡Esquivaste con éxito los asteroides! El viaje continúa.");
            } else {
                System.out.println("No lograste esquivar los asteroides a tiempo. El daño al sistema es leve, pero continúa.");
            }
        } else {
            System.out.println("Decidiste no esquivar los asteroides. El daño al sistema es moderado, pero puedes seguir viajando.");
        }
        break;

        case 1:
                // Desvío inesperado
                System.out.println("\n¡Atención! El sistema detectó un desvío inesperado en el trayecto.");
                System.out.print("¿Quieres recalcular la ruta? (S/N): ");
                char respuestaDesvio = scanner.next().charAt(0);
                if (respuestaDesvio == 'S' || respuestaDesvio == 's') {
                    if (rand.nextBoolean()) {
                        System.out.println("La recalculación fue exitosa. Ahora sigues en el camino correcto.");
                    } else {
                        System.out.println("No pudiste recalcular la ruta. El desvío es mayor y deberás tomar medidas adicionales.");
                    }
                } else {
                    System.out.println("Decidiste no recalcular la ruta. El desvío es crítico, pero aún tienes tiempo para corregirlo manualmente.");
                }
                break;

            default:
                System.out.println("El viaje transcurre sin problemas. ¡Sigues en camino!");
                break;

}
}
}