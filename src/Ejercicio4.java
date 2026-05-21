import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer los datos de la consola
        Scanner teclado = new Scanner(System.in);

        // Declaramos el vector con capacidad para 5 elementos
        int[] numeros = new int[5];

        // 1. Solicitar y almacenar los 5 números en el vector
        System.out.println("Por favor, ingresa 5 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // 2. Inicializar las variables mayor y menor con el primer elemento del vector
        int mayor = numeros[0];
        int menor = numeros[0];

        // 3. Recorrer el vector para encontrar el mayor y el menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; // Actualizamos si encontramos un número más grande
            }
            if (numeros[i] < menor) {
                menor = numeros[i]; // Actualizamos si encontramos un número más chico
            }
        }

        // 4. Mostrar los resultados en pantalla
        System.out.println("\n--- Resultados ---");
        System.out.println("El mayor valor ingresado es: " + mayor);
        System.out.println("El menor valor ingresado es: " + menor);

        // Cerramos el scanner para liberar recursos
        teclado.close();
    }
}