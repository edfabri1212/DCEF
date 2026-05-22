import java.util.Scanner;

public class Ejercicio6 {

    public static class MatrizTranspuesta {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            double[][] matrizOriginal = new double[3][3];
            double[][] matrizTranspuesta = new double[3][3];

            System.out.println("--- Registro de una Matriz 3x3 (9 Valores) ---");


            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print("Ingresa el valor para la posición [Fila " + (f + 1) + "][Columna " + (c + 1) + "]: ");
                    matrizOriginal[f][c] = scanner.nextDouble();
                }
            }



            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    matrizTranspuesta[c][f] = matrizOriginal[f][f];

                }
            }


            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    matrizTranspuesta[c][f] = matrizOriginal[f][c];
                }
            }


            System.out.println("\n--- Matriz Original ---");
            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    System.out.printf("[%6.2f] ", matrizOriginal[f][c]);
                }
                System.out.println();
            }


            System.out.println("\n--- Matriz Transpuesta (Filas cambiadas por Columnas) ---");
            for (int f = 0; f < 3; f++) {
                for (int c = 0; c < 3; c++) {
                    System.out.printf("[%6.2f] ", matrizTranspuesta[f][c]);
                }
                System.out.println();
            }

            scanner.close();
        }
    }
}
