package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        double cuenta;
        double cambio;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Cuanto dinero tienes en el banco?");
        cuenta = inputValue.nextDouble();
        System.out.println("Cuanto dinero vas a añadir o vas a quitar?");
        cambio = inputValue.nextDouble();

        cuenta = cuenta + cambio;
        if (cuenta <= 0) {
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }

    }
}
