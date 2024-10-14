// Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija
// por hora.
// Instrucciones:
//- Pide al usuario ingresar la cantidad de empleados.
//- Para cada empleado, pide ingresar las horas trabajadas.
//- Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float TARIFA_POR_HORA = 15;
        int numEmpleados;

        System.out.print("Ingrese la cantidad de empleados: ");
        numEmpleados = scanner.nextInt();

        int contador = 1;

        while (contador <= numEmpleados) {
            System.out.printf("Ingrese las horas trabajadas del empleado %d: ", contador);
            float horasTrabajadas = scanner.nextFloat();

            if (horasTrabajadas < 0) {
                System.out.println("Las horas trabajadas deben ser un valor positivo. Inténtalo de nuevo.");
            } else {
                float salario = horasTrabajadas * TARIFA_POR_HORA;
                System.out.printf("El salario del empleado %d es: $%.2f\n", contador, salario);
                contador++;
            }
        }
    }
}