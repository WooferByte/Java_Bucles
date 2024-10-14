// Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades
// disponibles para realizar un pedido.
// Instrucciones:
//- Pide al usuario ingresar el número de productos.
//- Usa un bucle para ingresar la cantidad disponible de cada producto.
//- Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProductos = 0;

        while (true) {
            try {
                System.out.print("Ingrese el número de productos: ");
                numProductos = Integer.parseInt(scanner.nextLine());

                if (numProductos > 0) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un número mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }

        int[] inventario = new int[numProductos];

        for (int i = 0; i < numProductos; i++) {
            while (true) {
                try {
                    System.out.print("Ingrese la cantidad disponible del producto " + (i + 1) + ": ");
                    int cantidad = Integer.parseInt(scanner.nextLine());

                    if (cantidad >= 0) {
                        inventario[i] = cantidad;
                        break;
                    } else {
                        System.out.println("La cantidad no puede ser negativa. Intente nuevamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debe ingresar un número entero válido.");
                }
            }
        }

        for (int i = 0; i < numProductos; i++) {
            if (inventario[i] < 5) {
                System.out.println("El producto " + (i + 1) + " tiene menos de 5 unidades. Es necesario realizar un pedido.");
            }
        }
    }
}