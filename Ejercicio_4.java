// Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de
// ventas al final de la semana.
// Instrucciones:
//- Usa un bucle para registrar las ventas diarias durante 7 días.
//- Al final del bucle, muestra el total de ventas de la semana.

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;

        for (int dia = 1; dia <= 7; dia++) {
            double ventasDia;

            while (true) {
                System.out.print("Ingrese las ventas del día " + dia + ": ");
                if (scanner.hasNextDouble()) {
                    ventasDia = scanner.nextDouble();
                    if (ventasDia >= 0) {
                        break;
                    } else {
                        System.out.println("Las ventas no pueden ser negativas. Intente nuevamente.");
                    }
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un valor numérico.");
                    scanner.next();
                }
            }

            totalVentas += ventasDia;
        }

        System.out.println("El total de ventas de la semana es: $" + totalVentas);
    }
}