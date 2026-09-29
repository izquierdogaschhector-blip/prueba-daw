package Ejemplos;

import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        System.out.println("Introduce los números");
        Scanner inputValue = new Scanner(System.in);
        int contador;
        int num;
        int positives = 0;
        for (contador = 0; contador <10; contador++) {
            num = inputValue.nextInt();
            if (num > 0) {
                positives = positives + 1;
            }
        }
        System.out.println("Hay "+positives+" números positivos");


    }
}
