package EstructurasDeDecision;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;

        System.out.println("Introduce los valores de cada lado del triángulo: ");
        Scanner inputValue = new Scanner(System.in);
        lado1 = inputValue.nextDouble();
        lado2 = inputValue.nextDouble();
        lado3 = inputValue.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("TRIANGULO");
        } else {
            System.out.println("IMPOSIBLE");
        }
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triángulo equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2 ) {
            System.out.println("Es un triángulo isósceles");
        } else {
            System.out.println("Es un triángulo escaleno");
        }
    }
}
