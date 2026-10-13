package EjerciciosDeRefuerzo1;

import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double grosor = inputValue.nextDouble() * 0.000001;
        double altura = inputValue.nextDouble();
        int dobleces = 0;
        while (grosor < altura) {
            grosor = grosor * 2;
            dobleces++;
        }
        System.out.println(dobleces);
    }
}
