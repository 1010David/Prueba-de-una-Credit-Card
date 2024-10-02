import java.util.ArrayList;
import java.util.Collections;

public class TarjetaCredito {
    private double limite;
    private double saldo;
    private ArrayList<Double> compras;

    // Constructor
    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite; // Al principio, el saldo es igual al límite
        this.compras = new ArrayList<>();
    }

    // Método para hacer una compra
    public boolean realizarCompra(double monto) {
        if (monto <= saldo) {
            compras.add(monto);
            saldo -= monto;
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar esta compra.");
            return false;
        }
    }

    // Método para mostrar el resumen de compras
    public void mostrarCompras() {
        // Ordenar las compras de menor a mayor
        Collections.sort(compras);
        System.out.println("Resumen de compras realizadas (ordenadas de menor a mayor):");
        for (double compra : compras) {
            System.out.println("Compra de $" + compra);
        }
        System.out.println("Saldo restante en la tarjeta: $" + saldo);
    }

    // Obtener el saldo
    public double getSaldo() {
        return saldo;
    }
}
