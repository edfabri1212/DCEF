import java.util.Scanner;

public class Ejercicio7 {

    public static class PuntoDeSilla {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            double[][] matriz = new double[3][4];
            boolean existePuntoSilla = false;

            System.out.println("--- Registro de una Matriz 3x4 (12 Valores) ---");


            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 4; c++) {
                    System.out.print("Ingresa el valor para la posición [Fila " + (f + 1) + "][Columna " + (c + 1) + "]: ");
                    matriz[f][c] = scanner.nextDouble();
                }
            }


            System.out.println("\n--- Matriz Ingresada ---");
            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 4; c++) {
                    System.out.printf("[%6.2f] ", matriz[f][c]);
                }
                System.out.println();
            }
            System.out.println("------------------------");


            for (int f = 0; f < 3; f++) {


                double minimoFila = matriz[f][0];
                int colMinimo = 0;

                for (int c = 1; c < 4; c++) {
                    if (matriz[f][c] < minimoFila) {
                        minimoFila = matriz[f][c];
                        colMinimo = c;
                    }
                }


                boolean esMaximoColumna = true;
                for (int filaEvaluar = 0; filaEvaluar < 3; filaEvaluar++) {
                    if (matriz[filaEvaluar][colMinimo] > minimoFila) {
                        esMaximoColumna = false;
                        break;
                    }
                }


                if (esMaximoColumna) {
                    System.out.printf("🎯 ¡Se encontró un Punto de Silla!%n");
                    System.out.printf("El número es: %.2f en la posición [Fila %d][Columna %d]%n",
                            minimoFila, (f + 1), (colMinimo + 1));
                    existePuntoSilla = true;
                }
            }


            if (!existePuntoSilla) {
                System.out.println("No existe ningún punto de silla en la matriz ingresada.");
            }

            scanner.close();
        }
    }
}