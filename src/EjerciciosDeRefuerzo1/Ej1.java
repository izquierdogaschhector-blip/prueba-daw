package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        double num;
        double doble;
        double triple;
        System.out.println("Introduce un número: ");
        Scanner inputValue = new Scanner(System.in);
        num = inputValue.nextDouble();

        doble = num * 2;
        triple = num * 3;

        System.out.println("El doble del número "+num+ " es "+doble+ " y el triple es " +triple);

    }
}
