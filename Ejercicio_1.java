// Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
// Instrucciones:
//- Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
//- Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float totalHoras = 0;
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Ingrese el número de la actividad:");
            System.out.println("1. Estudiar");
            System.out.println("2. Hacer ejercicios");
            System.out.println("3. Leer");
            System.out.println("4. Tiempo libre");
            System.out.println("5. Finalizar y calcular total");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese las horas dedicadas a esta actividad: ");
                float horas = scanner.nextFloat();

                if (horas < 0) {
                    System.out.println("Las horas deben ser positivas. Inténtalo de nuevo.");
                } else {
                    totalHoras += horas;
                }
            } else if (opcion == 5) {
                System.out.println("Cálculo finalizado.");
            } else {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }

        System.out.println("El total de horas dedicadas a las actividades es: " + totalHoras + " horas.");
    }
}

