package EstructurasDeDecision;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double importe;
        double importefinal;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el importe: ");
        importe = inputValue.nextDouble();
        System.out.println("¿Eres socio? (si/no)");
        String socio = inputValue.next();

        if (socio.equals("no") && importe <= 50) {
            importefinal =importe;
            System.out.println("El importe final es de: " + importefinal);
        } else if (socio.equals("no") && importe > 50) {
            importefinal = importe - importe * 0.05;
            System.out.println("El importe final es de: " +importefinal);
        } else if (socio.equals("si") && importe <= 50){
            importefinal = importe;
            System.out.println("El importe final es de: " +importefinal);
        } else if (socio.equals("si") && importe <= 100) {
            importefinal = importe - importe * 0.10;
            System.out.println("El importe final es de: " +importefinal);
        } else {
            importefinal = importe - importe *0.15;
            System.out.println("El importe final es de: " +importefinal);
        }
    }
}

