import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el límite de la tarjeta
        System.out.print("Introduce el límite de tu tarjeta de crédito: ");
        double limite = scanner.nextDouble();

        // Crear una instancia de TarjetaCredito
        TarjetaCredito tarjeta = new TarjetaCredito(limite);

        int opcion;
        do {
            // Menú de opciones
            System.out.println("\nMenu:");
            System.out.println("1. Realizar una compra");
            System.out.println("0. Salir y mostrar resumen de compras");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                // Ingresar el monto de la compra
                System.out.print("Introduce el valor de la compra: ");
                double monto = scanner.nextDouble();

                // Realizar la compra
                boolean compraExitosa = tarjeta.realizarCompra(monto);
                if (compraExitosa) {
                    System.out.println("Compra realizada exitosamente.");
                }
            }
        } while (opcion != 0);

        // Mostrar el resumen final de compras
        tarjeta.mostrarCompras();
    }
}
