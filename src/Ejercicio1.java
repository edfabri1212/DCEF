import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos el Scanner para leer lo que escribas en el teclado
        Scanner teclado = new Scanner(System.in);

        // Declaramos el vector con espacio para 10 elementos
        String[] frutas = new String[10];

        System.out.println("--- Registro de Frutas ---");

        // 1. Guardar los nombres en el vector
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingresa el nombre de la fruta " + (i + 1) + ": ");
            frutas[i] = teclado.nextLine(); // Aquí esperará a que escribas cada fruta
        }

        System.out.println("\n--- Lista de Frutas en Orden Inverso ---");

        // 2. Mostrar los elementos en forma inversa
        // Empezamos en la posición 9 (el último) y bajamos hasta la 0 (el primero)
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println("Posición [" + i + "]: " + frutas[i]);
        }

        // Cerramos el scanner
        teclado.close();
    }
}