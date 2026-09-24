package EstructurasDeDecision;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double kwh;
        double total;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el consumo mensual: ");
        kwh = inputValue.nextDouble();

        if (kwh <= 100) {
            total = kwh * 0.1;
        } else if (kwh <= 300) {
            total = 100 *0.1 + (kwh - 100) * 0.15;
        } else {
            total = ((100 * 0.1) + (200 * 0.15)) + ((kwh - 300) * 0.2);
        }

        System.out.println("El importe a pagar es de : "+total);
    }
}
