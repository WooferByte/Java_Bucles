// Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en
// la semana, las horas adicionales se consideran horas extras.
// Instrucciones:
//- Pide al usuario ingresar el número de empleados.
//- Usa un bucle para ingresar las horas trabajadas por cada empleado.
//- Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmpleados;

        do {
            System.out.print("Ingrese el número de empleados: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            numEmpleados = scanner.nextInt();
            if (numEmpleados <= 0) {
                System.out.println("El número de empleados debe ser mayor a 0.");
            }
        } while (numEmpleados <= 0);

        int contador = 1;

        do {
            int horasTrabajadas;

            do {
                System.out.print("Ingrese las horas trabajadas por el empleado " + contador + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next();
                }
                horasTrabajadas = scanner.nextInt();
                if (horasTrabajadas < 0) {
                    System.out.println("Las horas trabajadas no pueden ser negativas.");
                }
            } while (horasTrabajadas < 0);

            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + contador + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + contador + " no trabajó horas extras.");
            }

            contador++;
        } while (contador <= numEmpleados);
    }
}